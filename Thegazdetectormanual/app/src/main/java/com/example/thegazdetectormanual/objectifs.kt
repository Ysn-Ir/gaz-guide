package com.example.thegazdetectormanual

import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class objectifs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_objectifs)

        // Set the objectives text with styles
        val objectivesText = """<b><font color='#4CAF50'>Motivation :</font></b><br/><br/>
<font color='#333333'>Dans un paysage où le confort domestique peut rapidement se transformer en une situation critique, la menace invisible des fuites de gaz au Maroc demeure un défi de sécurité majeur. L'utilisation répandue du gaz butane et propane, indispensable à nos activités quotidiennes telles que la cuisine et le chauffage, est malheureusement accompagnée de risques significatifs. Les données de 2020 sont alarmantes : près de 15% des accidents domestiques enregistrés dans le pays étaient directement attribuables à des fuites de gaz, occasionnant un nombre tragique de pertes humaines et de blessures. Ces incidents, souvent évitables, laissent derrière eux des familles brisées et des foyers dévastés, victimes d'incendies et d'explosions soudaines provoquées par des fuites non détectées. La gravité de ces événements réside non seulement dans les vies humaines perdues, mais également dans la destruction matérielle et émotionnelle qu'ils engendrent. Toutefois, une solution existe, simple et accessible : le détecteur de gaz. Ce dispositif compact et sophistiqué peut, en quelques instants, alerter les occupants dès qu'une fuite est détectée, offrant ainsi une précieuse fenêtre de réaction.
<br/><br/>
« Osons agir pour prévenir les drames, adoptons les détecteurs de gaz et transformons nos foyers en refuges de sécurité. »
<br/><br/>
<b><font color='#4CAF50'>Contexte et introduction:</font></b><br/><br/>
<font color='#333333'>Nous, élèves ingénieurs engagés dans notre projet de module d'EEDD, nous nous lançons dans un projet d'envergure visant à répondre à un besoin crucial en matière de sécurité domestique et industrielle. Notre objectif est de concevoir et de mettre en œuvre un détecteur de gaz intelligent, équipé d'avertissements sonores et de notifications par message, ainsi que d'un système de ventilation automatique. Au cœur de notre démarche réside la volonté de prévenir efficacement les risques d'accidents liés aux fuites de gaz, tant dans les foyers que dans les environnements industriels. Nous aspirons à offrir aux utilisateurs un dispositif de détection rapide et fiable, capable de les alerter immédiatement en cas de danger, tout en assurant une ventilation optimale pour garantir un environnement sûr et sain. Dans le cadre de notre module sur la durabilité, nous mettons l'accent sur l'intégration des principes de durabilité et d'éthique dans notre démarche de conception et de développement. Notre objectif premier est de concevoir un dispositif qui allie performance et respect de l'environnement, s'inscrivant ainsi parfaitement dans les objectifs de développement durable (ODD) définis par les Nations Unies. Le projet s'inscrit particulièrement dans les objectifs suivants :</font>
<br/><br/>
<font color='#333333'>- ODD 3 : Santé et bien-être - En concevant un détecteur de gaz efficace, nous contribuons à la promotion de la santé et du bien-être en prévenant les risques d'accidents liés aux fuites de gaz, assurant ainsi la sécurité des individus et de leur environnement.</font>
<br/><br/>
<font color='#333333'>- ODD 7 : Énergie propre et d'un coût abordable - Notre dispositif favorise l'utilisation sûre et efficace du gaz, une source d'énergie essentielle dans de nombreux foyers et industries, contribuant ainsi à la promotion d'une énergie propre et abordable.</font>
<br/><br/>
<font color='#333333'>- ODD 9 : Industrie, innovation et infrastructures - En développant un détecteur de gaz intelligent, nous encourageons l'innovation technologique dans le domaine de la sécurité domestique et industrielle, tout en renforçant les infrastructures essentielles à un développement durable.</font>
<br/><br/>
<font color='#333333'>N.B : Dans ce rapport, nous détaillerons les différentes étapes de notre projet, de la conception à la réalisation du prototype fonctionnel. Nous exposerons également les technologies et les méthodologies que nous mettrons en œuvre pour atteindre nos objectifs, tout en soulignant notre engagement envers les principes de durabilité et les objectifs de développement durable. En résumé, notre ambition est de proposer un détecteur de gaz novateur, véritable concentré de technologies de pointe, qui incarne les valeurs d'innovation, de sécurité et de durabilité. Nous sommes convaincus que notre projet contribuera à relever les défis liés à la sécurité et à l'environnement, ouvrant ainsi la voie à un avenir plus sûr et plus durable pour tous.</font>
<b><font color='#4CAF50'>Réalisation:</font></b><br/><br/>
<font color='#333333'>La réalisation de ce projet de détecteur de gaz implique plusieurs étapes allant de la conception du circuit à la programmation de l'Arduino. Chacune de ces étapes est cruciale pour assurer le bon fonctionnement du système en détectant les gaz dangereux et en alertant les utilisateurs de manière efficace.</font>
<br/><br/>
<b><font color='#4CAF50'>1. Conception du Circuit</font></b><br/><br/>
<font color='#333333'>Tout d'abord, nous concevons le circuit en intégrant tous les composants nécessaires : un capteur de gaz MQ2, un microcontrôleur Arduino Uno, une LED, un buzzer, un ventilateur (ou un relais pour le contrôler), un écran LCD avec interface I2C, et un clavier 4x4. Chaque composant a un rôle spécifique.</font> 
<br/><br/>
<b><font color='#4CAF50'>2. Assemblage du Circuit</font></b><br/><br/>
<font color='#333333'>Ensuite, nous assemblons le circuit en connectant le capteur MQ2 à une broche analogique de l'Arduino. La LED, le buzzer et le ventilateur (via un relais) sont connectés aux broches numériques. L'écran LCD est connecté via l'interface I2C pour minimiser le nombre de broches utilisées, tandis que les broches du clavier sont connectées aux broches numériques restantes. Nous utilisons une breadboard et des fils de connexion pour faciliter l'assemblage et les modifications du circuit.</font>
<br/><br/>
<b><font color='#4CAF50'>3. Programmation de l'Arduino</font></b><br/><br/>
<font color='#333333'>Nous passons ensuite à la programmation de l'Arduino, incluant l'initialisation des différents composants et la logique de détection et d'alerte. Le code commence par inclure les bibliothèques nécessaires pour le fonctionnement du LCD (LiquidCrystal_I2C), du clavier (Keypad), et du module GSM (SoftwareSerial). Dans la fonction setup(), nous configurons les broches et saisissons le numéro de téléphone pour les alertes SMS via le clavier, en affichant les informations sur le LCD. Le cœur du programme réside dans la fonction loop(), où nous surveillons constamment le capteur MQ2. Une fonction auxiliaire calcule la valeur de référence du capteur en air propre, ce qui permet de comparer la résistance détectée en présence de gaz. Si la concentration de gaz détectée dépasse un seuil prédéfini, nous activons la LED, le buzzer, et le ventilateur. Simultanément, un SMS d'alerte est envoyé au numéro de téléphone configuré, incluant le niveau de gaz détecté.</font>
<br/><br/>
<b><font color='#4CAF50'>4. Analyse fonctionnelle</font></b><br/><br/>
<font color='#333333'>1. Fonction Globale</font><br/>
<font color='#333333'>Détecter la présence de gaz dangereux dans l'air et alerter les utilisateurs tout en activant automatiquement la ventilation pour réduire la concentration de gaz.</font>
<br/><br/>
<font color='#333333'>2. Fonctions Principales</font><br/>
<font color='#333333'>2.1 Détection de Gaz</font><br/>
<font color='#333333'>Capteur de gaz (MQ2)</font><br/>
<font color='#333333'>• Entrée : Présence de gaz dans l'air.</font><br/>
<font color='#333333'>• Traitement : Mesure de la concentration de gaz combustible.</font><br/>
<font color='#333333'>• Sortie : Signal analogique proportionnel à la concentration de gaz.</font><br/>
<font color='#333333'>2.2 Traitement et Analyse des Données</font><br/>
<font color='#333333'>Microcontrôleur (Arduino Uno)</font><br/>
<font color='#333333'>• Entrée : Signal analogique du capteur de gaz.</font><br/>
<font color='#333333'>• Traitement : Conversion du signal analogique en valeur numérique, comparaison avec des seuils prédéfinis.</font><br/>
<font color='#333333'>• Sortie : Commande pour activer des alertes visuelles (LED), sonores (buzzer) et actionner le relais pour la ventilation.</font><br/>
<font color='#333333'>3. Fonctions Secondaires</font><br/>
<font color='#333333'>3.1 Avertissement Visuel</font><br/>
<font color='#333333'>LED</font><br/>
<font color='#333333'>• Entrée : Signal de commande de l'Arduino.</font><br/>
<font color='#333333'>• Traitement : Allumage de la LED en cas de détection de gaz au-delà du seuil.</font><br/>
<font color='#333333'>• Sortie : Lumière visible pour alerter l'utilisateur.</font><br/>
<font color='#333333'>3.2 Avertissement Sonore</font><br/>
<font color='#333333'>Buzzer</font><br/>
<font color='#333333'>• Entrée : Signal de commande de l'Arduino.</font><br/>
<font color='#333333'>• Traitement : Activation du buzzer pour émettre un son en cas de détection de gaz au-delà du seuil.</font><br/>
<font color='#333333'>• Sortie : Son audible pour alerter l'utilisateur.</font><br/>
<font color='#333333'>3.3 Envoi de Notifications</font><br/>
<font color='#333333'>Module GSM</font><br/>
<font color='#333333'>• Entrée : Commande d'envoi de SMS de l'Arduino.</font><br/>
<font color='#333333'>• Traitement : Envoi d'un message texte au numéro de téléphone configuré en cas de détection de gaz.</font><br/>
<font color='#333333'>• Sortie : SMS d'alerte envoyé au téléphone de l'utilisateur.</font><br/>
<font color='#333333'>3.4 Ventilation Automatique</font><br/>
<font color='#333333'>Relais et Ventilateur</font><br/>
<font color='#333333'>• Entrée : Signal de commande de l'Arduino.</font><br/>
<font color='#333333'>• Traitement : Activation du relais pour allumer le ventilateur en cas de détection de gaz au-delà du seuil.</font><br/>
<font color='#333333'>• Sortie : Ventilation de l'air pour réduire la concentration de gaz.</font><br/>
<font color='#333333'>4. Interface Utilisateur</font><br/>
<font color='#333333'>Écran LCD et Clavier 4x4</font><br/>
<font color='#333333'>• Entrée : Commandes de l'utilisateur via le clavier.</font><br/>
<font color='#333333'>• Traitement : Affichage des niveaux de gaz détectés et saisie du numéro de téléphone pour les alertes.</font><br/>
<font color='#333333'>• Sortie : Interface visuelle pour l'utilisateur.</font><br/>
<font color='#333333'>5. Scénarios Fonctionnels</font><br/>
<font color='#333333'>Scénario 1 : Détection de Gaz Normal</font><br/>
<font color='#333333'>• Entrée : Air sans gaz dangereux ou avec une concentration inférieure au seuil.</font><br/>
<font color='#333333'>• Traitement : Lecture des valeurs du capteur.</font><br/>
<font color='#333333'>• Sortie : Pas d'alerte, LED éteinte, buzzer silencieux, ventilation inactive.</font><br/>
<font color='#333333'>Scénario 2 : Détection de Gaz Dangereux</font><br/>
<font color='#333333'>• Entrée : Air avec une concentration de gaz au-delà du seuil prédéfini.</font><br/>
<font color='#333333'>• Traitement : Lecture des valeurs du capteur, comparaison avec le seuil.</font><br/>
<font color='#<font color='#333333'>5. Tests et Calibration</font><br/>
<font color='#333333'>Enfin, nous testons le système pour nous assurer de son bon fonctionnement. La calibration du capteur MQ2 est une étape cruciale pour garantir des mesures précises. Cela implique de tester le capteur dans un environnement sans gaz pour établir une valeur de référence (R0) et ensuite de tester avec différentes concentrations de gaz pour ajuster les seuils de détection.</font><br/>
<font color='#333333'>En suivant ces étapes, nous pouvons concevoir, assembler, programmer et valider un détecteur de gaz efficace avec des avertissements auditifs et par message, ainsi qu'une ventilation automatique.</font>
 """.trimIndent()

        findViewById<TextView>(R.id.objectivesText).apply {
            text = Html.fromHtml(objectivesText, Html.FROM_HTML_MODE_LEGACY)
        }
    }
}
