package it.csi.mddtools.guigen.genutils;

import com.google.common.base.Objects;
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
import it.csi.mddtools.guigen.RoleMappingPDefVal;
import it.csi.mddtools.guigen.RoleMappingParam;
import it.csi.mddtools.guigen.SimpleType;
import it.csi.mddtools.guigen.Table;
import it.csi.mddtools.guigen.TableCustomizationPDefVal;
import it.csi.mddtools.guigen.TableCustomizationParam;
import it.csi.mddtools.guigen.Type;
import it.csi.mddtools.guigen.TypeNamespace;
import it.csi.mddtools.guigen.TypedArray;
import it.csi.mddtools.guigen.UCMappingPDefVal;
import it.csi.mddtools.guigen.UseCaseMappingParam;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class XEditUtils {
  public Object dummy2() {
    return null;
  }
  
  public String formatPDefParamVal(final TableCustomizationPDefVal pdv) {
    PDefParam _param = pdv.getParam();
    final TableCustomizationParam param = ((TableCustomizationParam) _param);
    boolean _notEquals = (!Objects.equal(param, null));
    if (_notEquals) {
      final Table table = param.getBaseTable();
      String s = "";
      String _xifexpression = null;
      boolean _notEquals_1 = (!Objects.equal(param, null));
      if (_notEquals_1) {
        _xifexpression = param.getName();
      } else {
        _xifexpression = "???";
      }
      String _plus = (s + _xifexpression);
      String _plus_1 = (_plus + "->");
      String _xifexpression_1 = null;
      boolean _notEquals_2 = (!Objects.equal(table, null));
      if (_notEquals_2) {
        _xifexpression_1 = table.getName();
      } else {
        _xifexpression_1 = "???";
      }
      String _plus_2 = (_plus_1 + _xifexpression_1);
      s = _plus_2;
      s = (s + "(");
      int _size = pdv.getExtraCols().size();
      String _plus_3 = ((s + "+") + Integer.valueOf(_size));
      String _plus_4 = (_plus_3 + " new columns, ");
      s = _plus_4;
      int _size_1 = pdv.getHiddenCols().size();
      String _plus_5 = ((s + "-") + Integer.valueOf(_size_1));
      String _plus_6 = (_plus_5 + " removed columns");
      s = _plus_6;
      s = (s + ")");
      return s;
    } else {
      return "???";
    }
  }
  
  public String formatAppDataFQN(final ApplicationData ad) {
    String label = "";
    EObject _eContainer = ad.eContainer();
    if ((_eContainer instanceof AppDataGroup)) {
      EObject _eContainer_1 = ad.eContainer();
      String _name = ((AppDataGroup) _eContainer_1).getName();
      String _plus = (label + _name);
      String _plus_1 = (_plus + "::");
      label = _plus_1;
    }
    String _name_1 = ad.getName();
    String _plus_2 = (label + _name_1);
    label = _plus_2;
    return label;
  }
  
  public String formatType(final Type t) {
    return "<unknown subclass of Type>";
  }
  
  public String formatType(final SimpleType t) {
    String _name = t.getName();
    String label = ("" + _name);
    boolean _isUserDefined = t.isUserDefined();
    if (_isUserDefined) {
      String _literal = t.getCode().getLiteral();
      String _plus = ((label + "{base:") + _literal);
      String _plus_1 = (_plus + "}");
      label = _plus_1;
    }
    return label;
  }
  
  public String formatType(final ComplexType t) {
    String label = "";
    EObject _eContainer = t.eContainer();
    if ((_eContainer instanceof TypeNamespace)) {
      EObject _eContainer_1 = t.eContainer();
      String _name = ((TypeNamespace) _eContainer_1).getName();
      String _plus = (label + _name);
      String _plus_1 = (_plus + "::");
      label = _plus_1;
    }
    String _name_1 = t.getName();
    String _plus_2 = (label + _name_1);
    label = _plus_2;
    return label;
  }
  
  public String formatType(final TypedArray t) {
    String label = "";
    EObject _eContainer = t.eContainer();
    if ((_eContainer instanceof TypeNamespace)) {
      EObject _eContainer_1 = t.eContainer();
      String _name = ((TypeNamespace) _eContainer_1).getName();
      String _plus = (label + _name);
      String _plus_1 = (_plus + "::");
      label = _plus_1;
    }
    Type _componentType = t.getComponentType();
    boolean _notEquals = (!Objects.equal(_componentType, null));
    if (_notEquals) {
      Type _componentType_1 = t.getComponentType();
      if ((_componentType_1 instanceof SimpleType)) {
        Type _componentType_2 = t.getComponentType();
        String _literal = ((SimpleType) _componentType_2).getCode().getLiteral();
        String _plus_2 = (label + _literal);
        label = _plus_2;
      } else {
        Type _componentType_3 = t.getComponentType();
        if ((_componentType_3 instanceof ComplexType)) {
          Type _componentType_4 = t.getComponentType();
          String _name_1 = ((ComplexType) _componentType_4).getName();
          String _plus_3 = (label + _name_1);
          label = _plus_3;
        } else {
          Type _componentType_5 = t.getComponentType();
          if ((_componentType_5 instanceof TypedArray)) {
            Type _componentType_6 = t.getComponentType();
            String _name_2 = ((TypedArray) _componentType_6).getName();
            String _plus_4 = (label + _name_2);
            label = _plus_4;
          } else {
            label = (label + "<unknown subclass of Type>");
          }
        }
      }
    } else {
      label = (label + "<unknown component type>");
    }
    label = (label + "[]");
    return label;
  }
  
  public ArrayList<PDefParam> findPDefCompatibleParams(final PDefParamVal pdpv) {
    final ArrayList<PDefParam> ris = new ArrayList<PDefParam>();
    EObject _eContainer = pdpv.eContainer();
    final PDefUseConfig pduconf = ((PDefUseConfig) _eContainer);
    EObject _eContainer_1 = pduconf.eContainer();
    final PanelDefUse pdu = ((PanelDefUse) _eContainer_1);
    final PanelDef pdef = pdu.getPanelDef();
    boolean _notEquals = (!Objects.equal(pdef, null));
    if (_notEquals) {
      EList<PDefParam> allParams = pdef.getParams();
      final Iterator<PDefParam> it_par = allParams.iterator();
      while (it_par.hasNext()) {
        {
          final PDefParam currParam = it_par.next();
          if (((((((pdpv instanceof AppDataMappingPDefVal) && (currParam instanceof AppDataMappingParam)) || ((pdpv instanceof ActorMappingPDefVal) && (currParam instanceof ActorMappingParam))) || ((pdpv instanceof RoleMappingPDefVal) && (currParam instanceof RoleMappingParam))) || ((pdpv instanceof UCMappingPDefVal) && (currParam instanceof UseCaseMappingParam))) || ((pdpv instanceof TableCustomizationPDefVal) && (currParam instanceof TableCustomizationParam)))) {
            ris.add(currParam);
          }
        }
      }
    }
    return ris;
  }
}
