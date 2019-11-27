declare class RNXposedUtils {
  static constructor(): void;
  getXposedVersion: () => Promise<Boolean>;
  isXposedInstallerAvailable: () => Promise<Boolean>;
  isXposedActive: () => Promise<Boolean>;
  getInstalledXposedPackages: () => Promise<Array>;
}

export default RNXposedUtils;
