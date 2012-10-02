package it.csi.mddtools.guigen.genutils

import it.csi.mddtools.guigen.TableCustomizationPDefVal
import it.csi.mddtools.guigen.TableCustomizationParam
import java.util.ArrayList
import it.csi.mddtools.guigen.PDefParam
import it.csi.mddtools.guigen.PDefParamVal
import it.csi.mddtools.guigen.PDefUseConfig
import it.csi.mddtools.guigen.PanelDefUse
import org.eclipse.emf.common.util.EList
import java.util.Iterator
import it.csi.mddtools.guigen.AppDataMappingPDefVal
import it.csi.mddtools.guigen.AppDataMappingParam
import it.csi.mddtools.guigen.ActorMappingParam
import it.csi.mddtools.guigen.RoleMappingParam
import it.csi.mddtools.guigen.UseCaseMappingParam
import it.csi.mddtools.guigen.UCMappingPDefVal
import it.csi.mddtools.guigen.RoleMappingPDefVal
import it.csi.mddtools.guigen.ActorMappingPDefVal
import it.csi.mddtools.guigen.ApplicationData
import it.csi.mddtools.guigen.AppDataGroup
import it.csi.mddtools.guigen.Type
import it.csi.mddtools.guigen.SimpleType
import it.csi.mddtools.guigen.ComplexType
import it.csi.mddtools.guigen.TypeNamespace
import it.csi.mddtools.guigen.TypedArray  

class XEditUtils {
	
//		/**
//	 * 
//	 * @param pdv
//	 * @return pdv.paramName->(dipende dal tipo di PV)
//	 */
//public static String formatPDefParamVal(PDefParamVal pdv){
//	if (pdv instanceof AppDataMappingPDefVal)
//		return formatPDefParamVal((AppDataMappingPDefVal)pdv);
//	else if (pdv instanceof TypeDefMappingPDefVal)
//		return formatPDefParamVal((TypeDefMappingPDefVal)pdv);
//	else if (pdv instanceof ActorMappingPDefVal)
//		return formatPDefParamVal((ActorMappingPDefVal)pdv);
//	else if (pdv instanceof RoleMappingPDefVal)
//		return formatPDefParamVal((RoleMappingPDefVal)pdv);
//	else if (pdv instanceof UCMappingPDefVal)
//		return formatPDefParamVal((UCMappingPDefVal)pdv);
//	else if (pdv instanceof TableCustomizationPDefVal)
//		return formatPDefParamVal((TableCustomizationPDefVal)pdv);
//	else return "<unknown PDDefParamVal class>";
//}
//	
//public static String formatPDefParamVal(AppDataMappingPDefVal pdv){
//	ApplicationData actAD = pdv.getActualAppData();
//	AppDataMappingParam param = (AppDataMappingParam)pdv.getParam();
//	return  (param != null? param.getName() : "???") + "->"+
//			(actAD != null? formatAppDataFQN(actAD) : "???");
//}
//
//public static String formatPDefParamVal(UCMappingPDefVal pdv){
//	UseCase actUC = pdv.getActualUseCase();
//	UseCaseMappingParam param = (UseCaseMappingParam)pdv.getParam();
//	return  (param != null? param.getName() : "???") + "->"+
//			(actUC != null? "["+actUC.getCode()+"]" : "???");
//}
//
//public static String formatPDefParamVal(RoleMappingPDefVal pdv){
//	Role actRole = pdv.getActualRole();
//	RoleMappingParam param = (RoleMappingParam)pdv.getParam();
//	return  (param != null? param.getName() : "???") + "->"+
//			(actRole != null? "["+actRole.getCode()+"@"+actRole.getDomainCode()+"]" : "???");
//}
//
//public static String formatPDefParamVal(ActorMappingPDefVal pdv){
//	Actor actActor = pdv.getActualActor();
//	ActorMappingParam param = (ActorMappingParam)pdv.getParam();
//	return  (param != null? param.getName() : "???") + "->"+
//			(actActor != null? "["+actActor.getCode()+"]" : "???");
//}
//
//public static String formatPDefParamVal(TypeDefMappingPDefVal pdv){
//	Type actTD = pdv.getActualTypeDef();
//	TypeDefMappingParam param = (TypeDefMappingParam)pdv.getParam();
//	return  (param != null? param.getName() : "???") + "->"+
//			(actTD != null? formatType(actTD) : "???");
//}
	///

	def String formatPDefParamVal(TableCustomizationPDefVal pdv){
		val param = pdv.param as TableCustomizationParam
		if (param != null) {
			val table = param.baseTable
			var s = ""
			s = s + (if (param != null)  param.name else "???") + "->"+
				if (table!=null) table.name else "???";
			s = s + "(";
			s = s + "+"+pdv.extraCols.size+" new columns, ";
			s = s + "-"+pdv.hiddenCols.size+" removed columns";
			s = s+ ")";
			return s
		}
		else
			return "???"
	}

////
//////////////////////////////////////////////////////////////


def String formatAppDataFQN(ApplicationData ad){
	var label = ""
	if (ad.eContainer instanceof AppDataGroup){
		label = label + (ad.eContainer() as AppDataGroup).name+"::"
	}
	label = label + ad.name;
	return label;
}


def String formatType(Type t) {
	return "<unknown subclass of Type>"
}

def String formatType(SimpleType t){
	var label = ""+t.name
	if (t.userDefined) {
		label = label + "{base:"+t.code.literal+"}"
	}
	return label;
}

def String formatType(ComplexType t){
	var label = ""
	if (t.eContainer instanceof TypeNamespace){
		label = label + (t.eContainer as TypeNamespace).name+"::"
	}
	label = label + t.name
	return label
	
}

def formatType(TypedArray t){
	
	var label = "";
	if (t.eContainer instanceof TypeNamespace){
		label = label + (t.eContainer as TypeNamespace).name+"::" 
	}
	if (t.componentType != null){
		if (t.componentType instanceof SimpleType){
			label = label + (t.getComponentType() as SimpleType).code.literal;
		}
		else if (t.componentType instanceof ComplexType){
			label = label + (t.getComponentType() as ComplexType).name;
		}
		else if (t.componentType instanceof TypedArray){
			label = label + (t.getComponentType() as TypedArray).name;
		}
		else label = label + "<unknown subclass of Type>"
	}
	else
		label = label + "<unknown component type>";
	label = label + "[]"
	return label;
}

def  ArrayList<PDefParam> findPDefCompatibleParams(PDefParamVal pdpv) {
	val  ris = new ArrayList<PDefParam>();
	val pduconf = pdpv.eContainer as PDefUseConfig
	val pdu = pduconf.eContainer as PanelDefUse
	val pdef = pdu.panelDef
	if (pdef != null){
		var EList<PDefParam> allParams = pdef.params;
		val it_par = allParams.iterator;
		while (it_par.hasNext()) {
			val currParam = it_par.next;
			if (
					(pdpv instanceof AppDataMappingPDefVal && currParam instanceof AppDataMappingParam)||
					(pdpv instanceof ActorMappingPDefVal && currParam instanceof ActorMappingParam)||
					(pdpv instanceof RoleMappingPDefVal && currParam instanceof RoleMappingParam)||
					(pdpv instanceof UCMappingPDefVal && currParam instanceof UseCaseMappingParam)||
					(pdpv instanceof TableCustomizationPDefVal && currParam instanceof TableCustomizationParam)
				)
				ris.add(currParam);
		}
		
	}
	return ris;
}

}