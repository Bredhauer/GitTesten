package gittesten;

public class GitTesten {

    public static void main(String[] args) {
        
        System.out.println("Ich arbeite heute das erste Mal mit Git");
        System.out.println("Ein Git Repository habe ich bereits initialisiert");
        System.out.println("Der Befehl hierfür lautet: git init");
        
        System.out.println("Gerade habe ich meinen ersten Commit durchgeführt"
                + "und damit die aktuelle Version in meinem lokalen Repository gespeichert");
        System.out.println("Das ging mit dem Befehl \"git commit\"."
                + "Zuvor musste ich mit \"git add --all\" alle im Projekt enthaltenen Dateien"
                + "für den Commit hinzufügen");
        
        System.out.println("Mit \"git revert HEAD\" macht man den letzten Commit rückgängig."
                + "Gleichzeitig wird ein neuer Commit durchgeführt.");
                
        System.out.println("Mit \"git log\" lassen wir uns die bisherigen Commits anzeigen");
        
        System.out.println("myFirstBranch");
    }
    
}
