# PrivacyPolicyComponent

**In the root build.gradle**
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
**In the gradle**
```
dependencies {
	        implementation 'com.github.Fespuna:PrivacyPolicyComponent:1.0'
}
```
**In the XML**
```
 <dev.fep.policylibrary.PolicyText
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:padding="20dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

```
