package net.sf.mzmine.modules.peaklistmethods.identification.lipididentification.lipids;

import net.sf.mzmine.modules.peaklistmethods.identification.lipididentification.lipids.LipidCoreClass.CoreClasses;
import net.sf.mzmine.modules.peaklistmethods.identification.lipididentification.lipids.LipidMainClass.MainClasses;

public class LipidClass extends AbstractLipidClass {
  // enum
  public enum Classes {
    MONOACYLGLYCEROLS(CoreClasses.GLYCEROLIPIDS, MainClasses.MONORADYLGLYCEROLS, "C4H7O4"), //
    MONOALKYLGLYCEROLS(CoreClasses.GLYCEROLIPIDS, MainClasses.MONORADYLGLYCEROLS, "C3H7O3");//

    // var
    private final CoreClasses coreClass;
    private final MainClasses mainClass;
    private final String backBoneFormula;

    // construct
    Classes(CoreClasses coreClass, MainClasses mainClass, String backBoneFormula) {
      this.coreClass = coreClass;
      this.mainClass = mainClass;
      this.backBoneFormula = backBoneFormula;
    }

    public CoreClasses getCoreClass() {
      return coreClass;
    }

    public MainClasses getMainClass() {
      return mainClass;
    }

    public String getBackBoneFormula() {
      return backBoneFormula;
    }
  }

  // var
  private LipidClass lclass;

  LipidClass(String name, String abbr) {
    super(name, abbr);
  }

  public LipidCoreClass getCoreClass() {
    return lclass.getCoreClass();
  }

  public LipidMainClass getMainClass() {
    return lclass.getMainClass();
  }

  public String getBackBoneFormula() {
    return lclass.getBackBoneFormula();
  }

  public LipidClass getLipidClass() {
    return lclass;
  }

}
