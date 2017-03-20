# Forms Icon
Hier ist ein kurzes Bespielt wie man das Icon einer Forms Anwendung ändern kann. Dazu ist eine kleine PJC und ein Aufruf der PJC in Forms nötig.

### Verwendung
  - Die Java Klasse IconPjc.java muss kompiliert und in eine Jar Datei gepackt werden
  - Diese Jar Datei muss dann bei Web Start signiert und in der JNLP Datei hinterlegt werden
  - In einer beliebigen Forms Maske muss dann die Klasse als BeanArea hinzugefügt werden
  - Per set_custom_property kann dann das Icon geändert werden 
  Beispiel: set_custom_property('LAF_BLOCK.ICON',1,'SET_FORMS_ICON','trasot.gif');

### Anmerkung
In diesem Beispiel wird das Icon aus der CodeBase geladen. Das entspricht dem Verzeichnis aus dem auch die Jar Dateien für die Anwendung geladen werden. Es kann aber auch ein anderes Verzeichnis verwendet werden wie z.B. die ImageBase. 
