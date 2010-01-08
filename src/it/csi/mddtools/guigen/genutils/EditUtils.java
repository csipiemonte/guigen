package it.csi.mddtools.guigen.genutils;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import it.csi.mddtools.guigen.Actor;
import it.csi.mddtools.guigen.ActorMappingPDefVal;
import it.csi.mddtools.guigen.ActorMappingParam;
import it.csi.mddtools.guigen.AppDataGroup;
import it.csi.mddtools.guigen.AppDataMappingPDefVal;
import it.csi.mddtools.guigen.AppDataMappingParam;
import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.ComplexType;
import it.csi.mddtools.guigen.PDefParam;
import it.csi.mddtools.guigen.PDefParamVal;
import it.csi.mddtools.guigen.PDefUseConfig;
import it.csi.mddtools.guigen.PanelDef;
import it.csi.mddtools.guigen.PanelDefUse;
import it.csi.mddtools.guigen.Role;
import it.csi.mddtools.guigen.RoleMappingPDefVal;
import it.csi.mddtools.guigen.RoleMappingParam;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypeDefMappingPDefVal;
import it.csi.mddtools.guigen.TypeNamespace;
import it.csi.mddtools.guigen.TypedArray;
import it.csi.mddtools.guigen.UCMappingPDefVal;
import it.csi.mddtools.guigen.UseCase;
import it.csi.mddtools.guigen.UseCaseMappingParam;

public class EditUtils {

	/**
	 * 
	 * @param pdv
	 * @return pdv.paramName->(dipende dal tipo di PV)
	 */
public static String formatPDefParamVal(PDefParamVal pdv){
	if (pdv instanceof AppDataMappingPDefVal)
		return formatPDefParamVal((AppDataMappingPDefVal)pdv);
	else if (pdv instanceof TypeDefMappingPDefVal)
		return formatPDefParamVal((TypeDefMappingPDefVal)pdv);
	else if (pdv instanceof ActorMappingPDefVal)
		return formatPDefParamVal((ActorMappingPDefVal)pdv);
	else if (pdv instanceof RoleMappingPDefVal)
		return formatPDefParamVal((RoleMappingPDefVal)pdv);
	else if (pdv instanceof UCMappingPDefVal)
		return formatPDefParamVal((UCMappingPDefVal)pdv);
	else return "<unknown PDDefParamVal class>";
}
	
public static String formatPDefParamVal(AppDataMappingPDefVal pdv){
	ApplicationData actAD = pdv.getActualAppData();
	AppDataMappingParam param = (AppDataMappingParam)pdv.getParam();
	return  (param != null? param.getName() : "???") + "->"+
			(actAD != null? formatAppDataFQN(actAD) : "???");
}

public static String formatPDefParamVal(UCMappingPDefVal pdv){
	UseCase actUC = pdv.getActualUseCase();
	UseCaseMappingParam param = (UseCaseMappingParam)pdv.getParam();
	return  (param != null? param.getName() : "???") + "->"+
			(actUC != null? "["+actUC.getCode()+"]" : "???");
}

public static String formatPDefParamVal(RoleMappingPDefVal pdv){
	Role actRole = pdv.getActualRole();
	RoleMappingParam param = (RoleMappingParam)pdv.getParam();
	return  (param != null? param.getName() : "???") + "->"+
			(actRole != null? "["+actRole.getCode()+"@"+actRole.getDomainCode()+"]" : "???");
}

public static String formatPDefParamVal(ActorMappingPDefVal pdv){
	Actor actActor = pdv.getActualActor();
	ActorMappingParam param = (ActorMappingParam)pdv.getParam();
	return  (param != null? param.getName() : "???") + "->"+
			(actActor != null? "["+actActor.getCode()+"]" : "???");
}

public static String formatPDefParamVal(TypeDefMappingPDefVal pdv){
	Type actTD = pdv.getActualTypeDef();
	AppDataMappingParam param = (AppDataMappingParam)pdv.getParam();
	return  (param != null? param.getName() : "???") + "->"+
			(actTD != null? formatType(actTD) : "???");
}

//////////////////////////////////////////////////////////////

public static String formatAppDataFQN(ApplicationData ad){
	String label = "";
	if (ad.eContainer() instanceof AppDataGroup){
		label+=((AppDataGroup)ad.eContainer()).getName()+"::";
	}
	label+=ad.getName();
	return label;
}

public static String formatType(Type t){
	if (t instanceof SimpleType)
		return formatType((SimpleType)t);
	else if (t instanceof ComplexType)
		return formatType((ComplexType)t);
	else if (t instanceof TypedArray)
		return formatType((TypedArray)t);
	else
		return "<unknown subclass of Type>";
}

public static String formatType(SimpleType t){
	String label = ""+t.getName();
	if (t.isUserDefined()){
		// user defined SimpleType
		label+= "{base:"+t.getCode().getLiteral()+"}";
	}
	return label;
	
}

public static String formatType(ComplexType t){
	String label = "";
	if (t.eContainer() instanceof TypeNamespace){
		label+=((TypeNamespace)t.eContainer()).getName()+"::";
	}
	label+=t.getName();
	return label;
}

public static String formatType(TypedArray t){
	String label = "";
	if (t.eContainer() instanceof TypeNamespace){
		label+=((TypeNamespace)t.eContainer()).getName()+"::";
	}
	if (t.getComponentType()!=null){
		if (t.getComponentType() instanceof SimpleType){
			label += ((SimpleType)(t.getComponentType())).getCode().getLiteral();
		}
		else if (t.getComponentType() instanceof ComplexType){
			label += ((ComplexType)(t.getComponentType())).getName();
		}
		else if (t.getComponentType() instanceof TypedArray){
			label += ((ComplexType)(t.getComponentType())).getName();
		}
		else label+="<unknown subclass of type>";
	}
	else
		label+="<unknown component type>";
	label+="[]";
	return label;
}

public static ArrayList<PDefParam> findPDefCompatibleParams(PDefParamVal pdpv) {
	ArrayList<PDefParam> ris = new ArrayList<PDefParam>();
	PDefUseConfig pduconf = (PDefUseConfig)pdpv.eContainer();
	PanelDefUse pdu = (PanelDefUse)(pduconf.eContainer());
	PanelDef def = pdu.getPanelDef();
	if (def != null){
		EList<PDefParam> allParams = def.getParams();
		Iterator<PDefParam> it_par = allParams.iterator();
		while (it_par.hasNext()) {
			PDefParam currParam = it_par.next();
			if (
					(pdpv instanceof AppDataMappingPDefVal && currParam instanceof AppDataMappingParam)||
					(pdpv instanceof ActorMappingPDefVal && currParam instanceof ActorMappingParam)||
					(pdpv instanceof RoleMappingPDefVal && currParam instanceof RoleMappingParam)||
					(pdpv instanceof UCMappingPDefVal && currParam instanceof UseCaseMappingParam)
				)
				ris.add(currParam);
		}
		
	}
	return ris;
}

}
