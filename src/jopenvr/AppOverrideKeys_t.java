package jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class AppOverrideKeys_t extends AlignedStructure {
	/** const char * */
	public Pointer pchKey;
	/** const char * */
	public Pointer pchValue;
	public AppOverrideKeys_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("pchKey", "pchValue");
	}
	public AppOverrideKeys_t(Pointer pchKey, Pointer pchValue) {
		super();
		this.pchKey = pchKey;
		this.pchValue = pchValue;
	}
	public AppOverrideKeys_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends AppOverrideKeys_t implements Structure.ByReference {
		
	};
	public static class ByValue extends AppOverrideKeys_t implements Structure.ByValue {
		
	};
}
