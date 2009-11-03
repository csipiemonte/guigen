package it.csi.mddtools.guigen.genutils;

import it.csi.mddtools.guigen.ActorMappingPDefVal;
import it.csi.mddtools.guigen.AppDataGroup;
import it.csi.mddtools.guigen.AppDataMappingPDefVal;
import it.csi.mddtools.guigen.AppDataMappingParam;
import it.csi.mddtools.guigen.ApplicationData;
import it.csi.mddtools.guigen.ComplexType;
import it.csi.mddtools.guigen.PDefParamVal;
import it.csi.mddtools.guigen.RoleMappingPDefVal;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypeDefMappingPDefVal;
import it.csi.mddtools.guigen.TypeNamespace;
import it.csi.mddtools.guigen.TypedArray;
import it.csi.mddtools.guigen.UCMappingPDefVal;

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
	else return "<unknown PDDefParamViel class>";
}
	
public static String formatPDefParamVal(AppDataMappingPDefVal pdv){
	ApplicationData actAD = pdv.getActualAppData();
	AppDataMappingParam param = (AppDataMappingParam)pdv.getParam();
	return  (param != null? param.getName() : "???") + "->"+
			(actAD != null? formatAppDataFQN(actAD) : "???");
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
	return t.getCode().getLiteral();
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

}
