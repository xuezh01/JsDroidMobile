package com.jsdroid.adb;

/**
 * This interface specifies the required functions for AdbCrypto to
 * perform Base64 encoding of its public key.
 * @author Cameron Gutman
 */
public interface AdbBase64 {
	/**
	 * This function must encoded the specified ipcData as a base 64 string, without
	 * appending any extra newlines or other characters.
	 * @param data IpcData to encode
	 * @return String containing base 64 encoded ipcData
	 */
	public String encodeToString(byte[] data);
}
