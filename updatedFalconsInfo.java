import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Atlantafalconsinfo {
    public static void main(String[] args) {
        // Welcome message
        JOptionPane.showMessageDialog(null, 
            "<html><body style='width: 450px; background-color: #000000; color: #FFFFFF; text-align: center;'>" +
            "<div style='background-color: #A71930; padding: 20px; margin-bottom: 15px;'>" +
            "<h1 style='color: #FFFFFF; margin: 5px; font-size: 24px;'>🦅 ATLANTA FALCONS 🦅</h1>" +
            "<h2 style='color: #FFFFFF; margin: 10px 0; font-size: 18px;'>Information Program</h2>" +
            "</div>" +
            "<p style='color: #FFFFFF; font-size: 16px; margin: 20px 0;'>" +
            "Welcome to the ultimate source for<br>" +
            "Atlanta Falcons history, stats, and information!</p>" +
            "<div style='background-color: #1a1a1a; padding: 15px; margin: 15px 0; border: 2px solid #A71930;'>" +
            "<p style='color: #A5ACAF; margin: 5px; font-size: 13px;'>" +
            "✓ Team History & Achievements<br>" +
            "✓ Player Profiles by Position<br>" +
            "✓ Stadium & Branding Info<br>" +
            "✓ Interactive 10-Question Quiz</p>" +
            "</div>" +
            "<div style='margin-top: 15px; padding: 12px; background-color: #A71930;'>" +
            "<b style='color: #FFFFFF; font-size: 18px;'>RISE UP!</b>" +
            "</div>" +
            "</body></html>",
            "Atlanta Falcons Info",
            JOptionPane.INFORMATION_MESSAGE);
        
        boolean running = true;
        
        while (running) {
            // Main menu using dropdown
            String[] options = {
                "Select an option...",
                "Team History",
                "Ownership & Front Office",
                "Business & Partnerships",
                "Stadium & Branding",
                "Championships & Achievements",
                "Notable Players",
                "Current Team Info",
                "Play Football Game 🏈",
                "Take a Quiz! 🎯",
                "Exit"
            };
            
            String choice = (String) JOptionPane.showInputDialog(
                null,
                "<html><body style='width: 400px; background-color: #000000; color: #FFFFFF; text-align: center;'>" +
                "<div style='background-color: #A71930; padding: 15px; margin-bottom: 15px;'>" +
                "<h1 style='color: #FFFFFF; margin: 5px;'>🦅 ATLANTA FALCONS 🦅</h1>" +
                "<h3 style='color: #FFFFFF; margin: 5px;'>Information Program</h3>" +
                "</div>" +
                "<p style='color: #FFFFFF; font-size: 14px; margin: 15px 0;'>" +
                "Select a topic from the dropdown menu below:</p>" +
                "<div style='margin-top: 15px; padding: 8px; background-color: #1a1a1a; border: 2px solid #A71930;'>" +
                "<b style='color: #A71930;'>RISE UP!</b>" +
                "</div>" +
                "</body></html>",
                "Atlanta Falcons Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
            
            // If user closes dialog or cancels, exit
            if (choice == null) {
                running = false;
                JOptionPane.showMessageDialog(null,
                    "<html><body style='width: 350px; background-color: #000000; color: #FFFFFF; text-align: center;'>" +
                    "<div style='background-color: #A71930; padding: 10px; margin-bottom: 10px;'>" +
                    "<h3 style='color: #FFFFFF; margin: 5px;'>Thank You!</h3>" +
                    "</div>" +
                    "<p style='color: #FFFFFF;'>Thanks for learning about the<br>Atlanta Falcons!</p>" +
                    "<div style='margin-top: 10px; padding: 8px; background-color: #A71930;'>" +
                    "<b style='color: #FFFFFF;'>RISE UP! 🦅</b>" +
                    "</div>" +
                    "</body></html>",
                    "Goodbye",
                    JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            
            // Skip if user didn't change selection
            if (choice.equals("Select an option...")) {
                continue;
            }
            
            // Handle selection
            if (choice.equals("Team History")) {
                showTeamHistory();
            } else if (choice.equals("Ownership & Front Office")) {
                showOwnershipAndFrontOffice();
            } else if (choice.equals("Business & Partnerships")) {
                showBusinessInfo();
            } else if (choice.equals("Stadium & Branding")) {
                showStadiumAndBranding();
            } else if (choice.equals("Championships & Achievements")) {
                showChampionships();
            } else if (choice.equals("Notable Players")) {
                showNotablePlayers();
            } else if (choice.equals("Current Team Info")) {
                showCurrentTeam();
            } else if (choice.equals("Play Football Game 🏈")) {
                FalconsFootballGame.launch();
            } else if (choice.equals("Take a Quiz! 🎯")) {
                takeQuiz();
            } else if (choice.equals("Exit")) {
                running = false;
                JOptionPane.showMessageDialog(null,
                    "<html><body style='width: 350px; background-color: #000000; color: #FFFFFF; text-align: center;'>" +
                    "<div style='background-color: #A71930; padding: 10px; margin-bottom: 10px;'>" +
                    "<h3 style='color: #FFFFFF; margin: 5px;'>Thank You!</h3>" +
                    "</div>" +
                    "<p style='color: #FFFFFF;'>Thanks for learning about the<br>Atlanta Falcons!</p>" +
                    "<div style='margin-top: 10px; padding: 8px; background-color: #A71930;'>" +
                    "<b style='color: #FFFFFF;'>RISE UP! 🦅</b>" +
                    "</div>" +
                    "</body></html>",
                    "Goodbye",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    private static void showTeamHistory() {
        String history = "<html><body style='width: 500px; background-color: #000000; color: #FFFFFF; font-family: Arial, sans-serif;'>" +
            "<div style='text-align: center; background-color: #A71930; padding: 10px; margin-bottom: 15px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>ATLANTA FALCONS HISTORY</h2>" +
            "</div>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr>" +
            "<td style='padding: 5px;'><b style='color: #A71930;'>Founded:</b> 1966</td>" +
            "<td style='padding: 5px;'><b style='color: #A71930;'>Division:</b> NFC South</td>" +
            "</tr>" +
            "</table>" +
            "<p style='margin-top: 10px; color: #FFFFFF;'><b style='color: #A71930;'>Team Colors:</b> Red, Black, Silver, and White</p>" +
            "<hr style='border: 1px solid #A71930;'>" +
            "<p style='color: #FFFFFF; line-height: 1.6;'>" +
            "The Atlanta Falcons joined the NFL as an expansion " +
            "team in 1966. The team's name was chosen through a " +
            "fan contest, symbolizing pride, courage, and a " +
            "fighting spirit.</p>" +
            "<p style='color: #FFFFFF; line-height: 1.6;'>" +
            "The Falcons have had periods of great success, " +
            "including multiple playoff appearances and two " +
            "Super Bowl appearances.</p>" +
            "<div style='text-align: center; margin-top: 15px; padding: 8px; background-color: #A71930;'>" +
            "<b style='color: #FFFFFF; font-size: 14px;'>RISE UP! 🦅</b>" +
            "</div>" +
            "</body></html>";
        
        JOptionPane.showMessageDialog(null, history,
            "Team History", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void showOwnershipAndFrontOffice() {
        String ownership = "<html><body style='width: 550px; background-color: #000000; color: #FFFFFF; font-family: Arial, sans-serif;'>" +
            "<div style='text-align: center; background-color: #A71930; padding: 10px; margin-bottom: 15px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>OWNERSHIP & FRONT OFFICE</h2>" +
            "</div>" +
            "<div style='background-color: #1a1a1a; padding: 10px; border-left: 4px solid #A71930; margin-bottom: 10px;'>" +
            "<h3 style='color: #A71930; margin-top: 0;'>OWNER: Arthur M. Blank</h3>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr><td style='padding: 3px;'>Purchase Date:</td><td style='padding: 3px;'>February 2002</td></tr>" +
            "<tr><td style='padding: 3px;'>Purchase Price:</td><td style='padding: 3px;'>$545 million</td></tr>" +
            "<tr><td style='padding: 3px;'>Co-founder:</td><td style='padding: 3px;'>The Home Depot</td></tr>" +
            "</table>" +
            "<ul style='color: #FFFFFF; margin: 10px 0;'>" +
            "<li>Also owns Atlanta United FC (MLS)</li>" +
            "<li>Mercedes-Benz Stadium (opened 2017)</li>" +
            "<li>Known for fan-first philosophy</li>" +
            "<li>Arthur M. Blank Family Foundation</li>" +
            "</ul>" +
            "</div>" +
            "<div style='background-color: #1a1a1a; padding: 10px; margin-bottom: 10px;'>" +
            "<p style='color: #A5ACAF; margin: 5px 0;'><b>Previous Owners:</b></p>" +
            "<p style='color: #FFFFFF; margin: 5px 0;'>• Rankin Smith Sr. (1966-1997)</p>" +
            "<p style='color: #FFFFFF; margin: 5px 0;'>• Taylor Smith (1997-2002)</p>" +
            "</div>" +
            "<hr style='border: 1px solid #A71930;'>" +
            "<h3 style='color: #A71930; text-align: center;'>FRONT OFFICE EXECUTIVES</h3>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr>" +
            "<td style='width: 50%; padding: 10px; vertical-align: top;'>" +
            "<b style='color: #A71930;'>CEO:</b> Rich McKay<br>" +
            "<span style='color: #A5ACAF; font-size: 12px;'>NFL Competition Committee Chairman<br>Joined: 2004</span>" +
            "</td>" +
            "<td style='width: 50%; padding: 10px; vertical-align: top;'>" +
            "<b style='color: #A71930;'>GM:</b> Terry Fontenot<br>" +
            "<span style='color: #A5ACAF; font-size: 12px;'>Appointed: 2021<br>Previous: New Orleans Saints</span>" +
            "</td>" +
            "</tr>" +
            "<tr>" +
            "<td style='padding: 10px; vertical-align: top;'>" +
            "<b style='color: #A71930;'>Head Coach:</b> Raheem Morris<br>" +
            "<span style='color: #A5ACAF; font-size: 12px;'>Appointed: 2024</span>" +
            "</td>" +
            "<td style='padding: 10px; vertical-align: top;'>" +
            "<b style='color: #A71930;'>President/CEO AMB Sports:</b><br>Steve Cannon" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "<div style='text-align: center; margin-top: 15px; padding: 8px; background-color: #A71930;'>" +
            "<b style='color: #FFFFFF;'>RISE UP! 🦅</b>" +
            "</div>" +
            "</body></html>";
        
        JOptionPane.showMessageDialog(null, ownership,
            "Ownership & Front Office", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void showBusinessInfo() {
        String business = "BUSINESS & PARTNERSHIPS\n\n" +
            "═══════════════════════════════════════\n" +
            "AMB SPORTS & ENTERTAINMENT\n" +
            "═══════════════════════════════════════\n" +
            "Parent company that operates:\n" +
            "• Atlanta Falcons (NFL)\n" +
            "• Atlanta United FC (MLS)\n" +
            "• Mercedes-Benz Stadium\n" +
            "• PGA TOUR Superstore\n" +
            "• Mountain Sky Guest Ranch\n\n" +
            "═══════════════════════════════════════\n" +
            "MAJOR PARTNERSHIPS & SPONSORS\n" +
            "═══════════════════════════════════════\n" +
            "Stadium Naming Rights:\n" +
            "• Mercedes-Benz (long-term partnership)\n\n" +
            "Jersey Sponsors:\n" +
            "• Worldpay (jersey patch sponsor)\n\n" +
            "Official Partners:\n" +
            "• Coca-Cola (Atlanta-based,\n" +
            "  founding partner)\n" +
            "• The Home Depot\n" +
            "  (Arthur Blank connection)\n" +
            "• Delta Air Lines (Atlanta-based)\n" +
            "• Chick-fil-A (Georgia-based)\n" +
            "• IBM\n" +
            "• Anheuser-Busch\n" +
            "• Pepsi (beverage partner at stadium)\n\n" +
            "═══════════════════════════════════════\n" +
            "INNOVATIVE BUSINESS PRACTICES\n" +
            "═══════════════════════════════════════\n" +
            "• Fan-First Pricing:\n" +
            "  Street-level concession prices\n" +
            "  (Example: $2 hot dogs, $2 sodas)\n" +
            "• Technology Integration:\n" +
            "  Cashless payments, mobile ticketing\n" +
            "• Community Investment:\n" +
            "  Arthur Blank Family Foundation\n" +
            "• Sustainability:\n" +
            "  LEED Platinum certified stadium\n\n" +
            "ECONOMIC IMPACT:\n" +
            "• Mercedes-Benz Stadium hosts\n" +
            "  100+ events annually\n" +
            "• Generates significant revenue for\n" +
            "  Atlanta economy\n" +
            "• Major employer in Atlanta metro area";
        
        JOptionPane.showMessageDialog(null, business,
            "Business & Partnerships", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void showStadiumAndBranding() {
        String combined = "<html><body style='width: 600px; background-color: #000000; color: #FFFFFF; font-family: Arial, sans-serif;'>" +
            "<div style='text-align: center; background-color: #A71930; padding: 10px; margin-bottom: 15px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>STADIUM & BRANDING</h2>" +
            "</div>" +
            "<div style='background-color: #1a1a1a; padding: 12px; border-left: 4px solid #A71930; margin-bottom: 15px;'>" +
            "<h3 style='color: #A71930; margin-top: 0;'>MERCEDES-BENZ STADIUM</h3>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr><td style='width: 50%;'><b style='color: #A5ACAF;'>Opened:</b> 2017</td>" +
            "<td><b style='color: #A5ACAF;'>Location:</b> Atlanta, GA</td></tr>" +
            "<tr><td><b style='color: #A5ACAF;'>Capacity:</b> 71,000</td>" +
            "<td><b style='color: #A5ACAF;'>Expandable:</b> 75,000</td></tr>" +
            "</table>" +
            "<p style='color: #A71930; font-weight: bold; margin: 10px 0 5px 0;'>Notable Features:</p>" +
            "<ul style='color: #FFFFFF; margin: 5px 0;'>" +
            "<li>Revolutionary retractable pinwheel roof</li>" +
            "<li>360° halo video board (largest in NFL)</li>" +
            "<li>Fan-friendly pricing ($2 hot dogs!)</li>" +
            "<li>LEED Platinum certified</li>" +
            "<li>Home to Atlanta United FC (MLS)</li>" +
            "</ul>" +
            "</div>" +
            "<hr style='border: 1px solid #A71930;'>" +
            "<h3 style='color: #A71930; text-align: center; margin: 15px 0;'>LOGO EVOLUTION</h3>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr>" +
            "<td style='width: 33%; padding: 8px; vertical-align: top; background-color: #1a1a1a;'>" +
            "<b style='color: #A71930;'>1966-1989</b><br>" +
            "<span style='color: #A5ACAF; font-size: 12px;'>Black falcon<br>Classic design</span>" +
            "</td>" +
            "<td style='width: 33%; padding: 8px; vertical-align: top; background-color: #1a1a1a;'>" +
            "<b style='color: #A71930;'>1990-2002</b><br>" +
            "<span style='color: #A5ACAF; font-size: 12px;'>Aggressive design<br>\"Dirty Bird\" era</span>" +
            "</td>" +
            "<td style='width: 33%; padding: 8px; vertical-align: top; background-color: #1a1a1a;'>" +
            "<b style='color: #A71930;'>2003-Present</b><br>" +
            "<span style='color: #A5ACAF; font-size: 12px;'>F-shaped falcon<br>Current logo</span>" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "<hr style='border: 1px solid #A71930; margin: 15px 0;'>" +
            "<h3 style='color: #A71930; text-align: center;'>TEAM COLORS & BRANDING</h3>" +
            "<table style='width: 100%; color: #FFFFFF; margin-top: 10px;'>" +
            "<tr>" +
            "<td style='padding: 8px; background-color: #A71930; text-align: center; font-weight: bold;'>RED<br>#A71930</td>" +
            "<td style='padding: 8px; background-color: #000000; border: 1px solid #A71930; text-align: center; font-weight: bold;'>BLACK<br>#000000</td>" +
            "<td style='padding: 8px; background-color: #A5ACAF; color: #000000; text-align: center; font-weight: bold;'>SILVER<br>#A5ACAF</td>" +
            "<td style='padding: 8px; background-color: #FFFFFF; color: #000000; text-align: center; font-weight: bold;'>WHITE<br>#FFFFFF</td>" +
            "</tr>" +
            "</table>" +
            "<div style='background-color: #1a1a1a; padding: 10px; margin-top: 15px;'>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr><td><b style='color: #A71930;'>Motto:</b> \"Rise Up!\" (since 2007)</td></tr>" +
            "<tr><td><b style='color: #A71930;'>Mascot:</b> Freddie Falcon (since 1966)</td></tr>" +
            "<tr><td><b style='color: #A71930;'>Fight Song:</b> \"We Are Falcon Proud\"</td></tr>" +
            "</table>" +
            "</div>" +
            "<div style='text-align: center; margin-top: 15px; padding: 10px; background-color: #A71930;'>" +
            "<b style='color: #FFFFFF; font-size: 16px;'>RISE UP! 🦅</b>" +
            "</div>" +
            "</body></html>";
        
        JOptionPane.showMessageDialog(null, combined,
            "Stadium & Branding", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void showChampionships() {
        String achievements = "<html><body style='width: 550px; background-color: #000000; color: #FFFFFF; font-family: Arial, sans-serif;'>" +
            "<div style='text-align: center; background-color: #A71930; padding: 10px; margin-bottom: 15px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>CHAMPIONSHIPS & ACHIEVEMENTS</h2>" +
            "</div>" +
            "<div style='background-color: #1a1a1a; padding: 15px; border-left: 4px solid #A71930; margin-bottom: 15px;'>" +
            "<h3 style='color: #A71930; text-align: center; margin-top: 0;'>SUPER BOWL APPEARANCES: 2</h3>" +
            "<table style='width: 100%; color: #FFFFFF; margin-top: 10px;'>" +
            "<tr>" +
            "<td style='width: 50%; padding: 10px; background-color: #0d0d0d;'>" +
            "<b style='color: #A71930;'>Super Bowl XXXIII</b><br>" +
            "<span style='color: #A5ACAF;'>1998 Season</span><br>" +
            "Lost to Denver Broncos" +
            "</td>" +
            "<td style='width: 50%; padding: 10px; background-color: #0d0d0d;'>" +
            "<b style='color: #A71930;'>Super Bowl LI</b><br>" +
            "<span style='color: #A5ACAF;'>2016 Season</span><br>" +
            "Lost to New England Patriots" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "</div>" +
            "<hr style='border: 1px solid #A71930;'>" +
            "<table style='width: 100%; color: #FFFFFF; margin: 15px 0;'>" +
            "<tr>" +
            "<td style='width: 50%; padding: 10px; text-align: center; background-color: #1a1a1a;'>" +
            "<h3 style='color: #A71930; margin: 5px 0;'>NFC CHAMPIONSHIPS</h3>" +
            "<p style='font-size: 32px; font-weight: bold; color: #FFFFFF; margin: 10px 0;'>2</p>" +
            "<span style='color: #A5ACAF;'>1998 • 2016</span>" +
            "</td>" +
            "<td style='width: 50%; padding: 10px; text-align: center; background-color: #1a1a1a;'>" +
            "<h3 style='color: #A71930; margin: 5px 0;'>DIVISION TITLES</h3>" +
            "<p style='font-size: 32px; font-weight: bold; color: #FFFFFF; margin: 10px 0;'>6</p>" +
            "<span style='color: #A5ACAF;'>1980, 1998, 2004<br>2010, 2012, 2016</span>" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "<div style='text-align: center; padding: 10px; background-color: #1a1a1a; margin: 10px 0;'>" +
            "<b style='color: #A71930;'>PLAYOFF APPEARANCES:</b> <span style='color: #FFFFFF; font-size: 20px;'>14+</span>" +
            "</div>" +
            "<hr style='border: 1px solid #A71930;'>" +
            "<div style='background-color: #A71930; padding: 12px; margin-top: 15px;'>" +
            "<h4 style='color: #FFFFFF; margin: 5px 0;'>2016 SEASON HIGHLIGHTS</h4>" +
            "<p style='color: #FFFFFF; margin: 8px 0; font-size: 13px;'>" +
            "Led Super Bowl LI 28-3 in the third quarter<br>" +
            "• Matt Ryan - NFL MVP<br>" +
            "• Julio Jones - All-Pro WR<br>" +
            "• Highest-scoring offense in NFL history" +
            "</p>" +
            "</div>" +
            "<div style='text-align: center; margin-top: 15px; padding: 10px; background-color: #A71930;'>" +
            "<b style='color: #FFFFFF; font-size: 16px;'>RISE UP! 🦅</b>" +
            "</div>" +
            "</body></html>";
        
        JOptionPane.showMessageDialog(null, achievements,
            "Championships & Achievements", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void showNotablePlayers() {
        // Player position menu using dropdown
        String[] playerOptions = {
            "Select a position...",
            "Quarterbacks (QB)",
            "Running Backs (RB)",
            "Wide Receivers & Tight Ends",
            "Offensive Line",
            "Defensive Line & Linebackers",
            "Defensive Backs (CB/S)",
            "Hall of Fame Overview",
            "Back to Main Menu"
        };
        
        String choice = (String) JOptionPane.showInputDialog(
            null,
            "<html><body style='width: 450px; background-color: #000000; color: #FFFFFF; text-align: center;'>" +
            "<div style='background-color: #A71930; padding: 12px; margin-bottom: 12px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>NOTABLE PLAYERS</h2>" +
            "</div>" +
            "<p style='color: #FFFFFF; font-size: 14px;'>" +
            "Select a position group to explore Falcons legends:</p>" +
            "<div style='margin-top: 12px; padding: 6px; background-color: #1a1a1a; border: 2px solid #A71930;'>" +
            "<span style='color: #A5ACAF; font-size: 12px;'>Organized by football positions</span>" +
            "</div>" +
            "</body></html>",
            "Notable Falcons Players by Position",
            JOptionPane.QUESTION_MESSAGE,
            null,
            playerOptions,
            playerOptions[0]);
        
        // If user closes dialog or selects back, return
        if (choice == null || choice.equals("Back to Main Menu")) {
            return;
        }
        
        // Skip if user didn't change selection
        if (choice.equals("Select a position...")) {
            return;
        }
        
        // Handle selection
        if (choice.equals("Quarterbacks (QB)")) {
            showQuarterbacks();
        } else if (choice.equals("Running Backs (RB)")) {
            showRunningBacks();
        } else if (choice.equals("Wide Receivers & Tight Ends")) {
            showReceiversAndTightEnds();
        } else if (choice.equals("Offensive Line")) {
            showOffensiveLine();
        } else if (choice.equals("Defensive Line & Linebackers")) {
            showDefensiveLineLB();
        } else if (choice.equals("Defensive Backs (CB/S)")) {
            showDefensiveBacks();
        } else if (choice.equals("Hall of Fame Overview")) {
            showHallOfFamers();
        }
    }
    
    private static void showQuarterbacks() {
        String qbs = "<html><body style='width: 600px; background-color: #000000; color: #FFFFFF; font-family: Arial, sans-serif;'>" +
            "<div style='text-align: center; background-color: #A71930; padding: 10px; margin-bottom: 15px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>NOTABLE FALCONS QUARTERBACKS</h2>" +
            "</div>" +
            "<div style='background-color: #1a1a1a; padding: 12px; border-left: 4px solid #A71930; margin-bottom: 15px;'>" +
            "<h3 style='color: #A71930; margin: 0 0 8px 0;'>MATT RYAN - \"MATTY ICE\"</h3>" +
            "<p style='color: #A5ACAF; margin: 5px 0;'>Years: 2008-2021 • Jersey #2 • College: Boston College</p>" +
            "<table style='width: 100%; color: #FFFFFF; margin-top: 10px;'>" +
            "<tr>" +
            "<td style='width: 50%; vertical-align: top;'>" +
            "<p style='color: #A71930; font-weight: bold; margin: 5px 0;'>Achievements:</p>" +
            "<ul style='margin: 5px 0; padding-left: 20px; font-size: 13px;'>" +
            "<li>2016 NFL MVP (unanimous)</li>" +
            "<li>2008 Offensive ROY</li>" +
            "<li>4× Pro Bowl selection</li>" +
            "<li>Led to Super Bowl LI</li>" +
            "</ul>" +
            "</td>" +
            "<td style='width: 50%; vertical-align: top;'>" +
            "<p style='color: #A71930; font-weight: bold; margin: 5px 0;'>Franchise Records:</p>" +
            "<ul style='margin: 5px 0; padding-left: 20px; font-size: 13px;'>" +
            "<li>Passing yards: 59,735</li>" +
            "<li>Passing TDs: 367</li>" +
            "<li>Completions: 5,339</li>" +
            "<li>Games started: 222</li>" +
            "</ul>" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "<p style='color: #FFFFFF; margin: 8px 0; font-size: 13px; font-style: italic;'>" +
            "Ring of Honor candidate • Led highest-scoring offense in NFL (2016)</p>" +
            "</div>" +
            "<div style='background-color: #1a1a1a; padding: 12px; border-left: 4px solid #A71930; margin-bottom: 15px;'>" +
            "<h3 style='color: #A71930; margin: 0 0 8px 0;'>MICHAEL VICK</h3>" +
            "<p style='color: #A5ACAF; margin: 5px 0;'>Years: 2001-2006 • Jersey #7 • College: Virginia Tech</p>" +
            "<table style='width: 100%; color: #FFFFFF; margin-top: 10px;'>" +
            "<tr>" +
            "<td style='width: 50%; vertical-align: top;'>" +
            "<p style='color: #A71930; font-weight: bold; margin: 5px 0;'>Achievements:</p>" +
            "<ul style='margin: 5px 0; padding-left: 20px; font-size: 13px;'>" +
            "<li>1st overall pick (2001)</li>" +
            "<li>First African American QB #1</li>" +
            "<li>3× Pro Bowl w/ Falcons</li>" +
            "<li>First QB 1,000 rush yards</li>" +
            "</ul>" +
            "</td>" +
            "<td style='width: 50%; vertical-align: top;'>" +
            "<p style='color: #A71930; font-weight: bold; margin: 5px 0;'>Career Stats:</p>" +
            "<ul style='margin: 5px 0; padding-left: 20px; font-size: 13px;'>" +
            "<li>11,505 passing yards</li>" +
            "<li>3,859 rushing yards</li>" +
            "<li>4.33 40-yard dash</li>" +
            "</ul>" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "<p style='color: #FFFFFF; margin: 8px 0; font-size: 13px; font-style: italic;'>" +
            "Revolutionary dual-threat QB • Most electrifying Falcon ever</p>" +
            "</div>" +
            "<hr style='border: 1px solid #A71930;'>" +
            "<h4 style='color: #A71930; text-align: center; margin: 10px 0;'>OTHER NOTABLE QBs</h4>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr>" +
            "<td style='width: 50%; padding: 10px; background-color: #1a1a1a; text-align: center;'>" +
            "<b style='color: #A71930;'>Steve Bartkowski</b><br>" +
            "<span style='color: #A5ACAF; font-size: 12px;'>(1975-1985)</span><br>" +
            "<span style='font-size: 13px;'>1st overall pick<br>2× Pro Bowl</span>" +
            "</td>" +
            "<td style='width: 50%; padding: 10px; background-color: #1a1a1a; text-align: center;'>" +
            "<b style='color: #A71930;'>Chris Chandler</b><br>" +
            "<span style='color: #A5ACAF; font-size: 12px;'>(1997-2001)</span><br>" +
            "<span style='font-size: 13px;'>Led to SB XXXIII</span>" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "<div style='text-align: center; margin-top: 15px; padding: 10px; background-color: #A71930;'>" +
            "<b style='color: #FFFFFF; font-size: 16px;'>RISE UP! 🦅</b>" +
            "</div>" +
            "</body></html>";
        
        JOptionPane.showMessageDialog(null, qbs,
            "Quarterbacks", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void showRunningBacks() {
        String rbs = "NOTABLE FALCONS RUNNING BACKS\n\n" +
            "═══════════════════════════════════════\n" +
            "WILLIAM ANDREWS\n" +
            "═══════════════════════════════════════\n" +
            "Years: 1979-1983, 1986\n" +
            "College: Auburn\n\n" +
            "Achievements:\n" +
            "• 4× Pro Bowl selection\n" +
            "• 1979 NFL Offensive Rookie\n" +
            "  of the Year\n" +
            "• Led NFC in rushing (1983)\n" +
            "• Ring of Honor inductee\n\n" +
            "═══════════════════════════════════════\n" +
            "JAMAL ANDERSON\n" +
            "═══════════════════════════════════════\n" +
            "Years: 1994-2001\n" +
            "College: Utah\n\n" +
            "Achievements:\n" +
            "• Pro Bowl selection (1998)\n" +
            "• 1,846 rushing yards in 1998\n" +
            "  (franchise record)\n" +
            "• Key player in Super Bowl\n" +
            "  XXXIII run\n" +
            "• Famous 'Dirty Bird' celebration\n\n" +
            "═══════════════════════════════════════\n" +
            "WARRICK DUNN\n" +
            "═══════════════════════════════════════\n" +
            "Years: 2004-2007\n" +
            "(also Tampa Bay 1997-2001)\n" +
            "College: Florida State\n\n" +
            "Achievements:\n" +
            "• 3× Pro Bowl selection\n" +
            "• 2004 Walter Payton Man\n" +
            "  of the Year\n" +
            "• 10,967 career rushing yards\n" +
            "• Warrick Dunn Charities\n" +
            "  builds homes\n\n" +
            "═══════════════════════════════════════\n" +
            "CURRENT STAR\n" +
            "═══════════════════════════════════════\n" +
            "• BIJAN ROBINSON\n" +
            "  8th overall pick (2023)\n" +
            "  Texas - Dynamic playmaker";
        
        JOptionPane.showMessageDialog(null, rbs,
            "Running Backs", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void showReceiversAndTightEnds() {
        String wrs = "NOTABLE RECEIVERS & TIGHT ENDS\n\n" +
            "═══════════════════════════════════════\n" +
            "WIDE RECEIVERS\n" +
            "═══════════════════════════════════════\n\n" +
            "RODDY WHITE\n" +
            "Years: 2005-2015 | Jersey #: 84\n" +
            "College: UAB\n\n" +
            "Achievements:\n" +
            "• 4× Pro Bowl (2008-2011)\n" +
            "• 2× Second-team All-Pro\n" +
            "• Led NFL in receptions (115)\n" +
            "  in 2010\n\n" +
            "Franchise Records:\n" +
            "• Most receptions: 808\n" +
            "• Most receiving yards: 10,863\n" +
            "• Most receiving TDs: 63\n" +
            "• Six 1,000+ yard seasons\n" +
            "• Ring of Honor inductee\n\n" +
            "JULIO JONES\n" +
            "Years: 2011-2020 | Jersey #: 11\n" +
            "College: Alabama\n\n" +
            "Achievements:\n" +
            "• 7× Pro Bowl selection\n" +
            "• 2× First-team All-Pro\n" +
            "• 2015 NFL receiving yards\n" +
            "  leader (1,871)\n" +
            "• 12,896 receiving yards\n" +
            "• 6'3\", 4.39 40-yard dash\n" +
            "• Future Hall of Fame candidate\n\n" +
            "ANDRE RISON (1990-1994)\n" +
            "• 4× Pro Bowl with Falcons\n" +
            "• Known as \"Bad Moon\"\n\n" +
            "TERANCE MATHIS (1994-2001)\n" +
            "• 1998 Pro Bowl\n" +
            "• Key receiver in Super Bowl run\n\n" +
            "CURRENT: DRAKE LONDON\n" +
            "• 8th overall pick (2022)\n" +
            "• USC - Rising star\n\n" +
            "═══════════════════════════════════════\n" +
            "TIGHT ENDS\n" +
            "═══════════════════════════════════════\n\n" +
            "TONY GONZALEZ - Hall of Famer\n" +
            "Years: 2009-2013 | Jersey #: 88\n" +
            "College: California\n\n" +
            "Career Stats (17 seasons):\n" +
            "• 1,325 receptions (TE record)\n" +
            "• 15,127 receiving yards\n" +
            "• 14× Pro Bowl, 10× All-Pro\n" +
            "• Pro Football Hall of Fame (2019)\n" +
            "• Revolutionized TE position\n" +
            "• 270 consecutive games\n\n" +
            "With Falcons:\n" +
            "• 5× Pro Bowl (2009-2013)\n" +
            "• 409 receptions, 4,187 yards\n" +
            "• 35 touchdowns\n\n" +
            "CURRENT: KYLE PITTS\n" +
            "• 4th overall pick (2021)\n" +
            "• Florida - Elite receiving TE";
        
        JOptionPane.showMessageDialog(null, wrs,
            "Receivers & Tight Ends", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void showOffensiveLine() {
        String ol = "NOTABLE OFFENSIVE LINEMEN\n\n" +
            "═══════════════════════════════════════\n" +
            "JEFF VAN NOTE - Center\n" +
            "═══════════════════════════════════════\n" +
            "Years: 1969-1986\n" +
            "College: Kentucky\n\n" +
            "Achievements:\n" +
            "• 6× Pro Bowl selection\n" +
            "• Ring of Honor inductee\n" +
            "• 246 games played\n" +
            "  (franchise record)\n" +
            "• One of the best centers in\n" +
            "  NFL history\n" +
            "• Anchor of Falcons line\n" +
            "  for 18 seasons\n\n" +
            "═══════════════════════════════════════\n" +
            "MIKE KENN - Tackle\n" +
            "═══════════════════════════════════════\n" +
            "Years: 1978-1994\n" +
            "College: Michigan\n\n" +
            "Achievements:\n" +
            "• 5× Pro Bowl selection\n" +
            "• 3× All-Pro\n" +
            "• Ring of Honor inductee\n" +
            "• 251 games played\n" +
            "• Longest-tenured Falcon\n\n" +
            "═══════════════════════════════════════\n" +
            "CHRIS HINTON - Guard/Tackle\n" +
            "═══════════════════════════════════════\n" +
            "Years: 1993-1998 with Falcons\n" +
            "College: Northwestern\n\n" +
            "Achievements:\n" +
            "• 7× Pro Bowl (career)\n" +
            "• 2× Pro Bowl with Falcons\n" +
            "• Key blocker in 1998\n" +
            "  Super Bowl run\n\n" +
            "═══════════════════════════════════════\n" +
            "OTHER NOTABLE LINEMEN\n" +
            "═══════════════════════════════════════\n" +
            "• Bill Fralic - Guard (1985-1993)\n" +
            "  4× Pro Bowl\n" +
            "• Bob Whitfield - Tackle (1992-2001)\n" +
            "  Pro Bowl blocker\n" +
            "• Todd McClure - Center (1999-2013)\n" +
            "  2× Pro Bowl";
        
        JOptionPane.showMessageDialog(null, ol,
            "Offensive Line", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void showDefensiveLineLB() {
        String def = "DEFENSIVE LINE & LINEBACKERS\n\n" +
            "═══════════════════════════════════════\n" +
            "DEFENSIVE LINE\n" +
            "═══════════════════════════════════════\n\n" +
            "CLAUDE HUMPHREY - DE\n" +
            "Hall of Famer (2014)\n" +
            "Years: 1968-1978\n\n" +
            "Achievements:\n" +
            "• 6× Pro Bowl selection\n" +
            "• 1968 Defensive Rookie of Year\n" +
            "• First defensive player in\n" +
            "  Falcons history\n" +
            "• Fierce pass rusher\n\n" +
            "JOHN ABRAHAM - DE\n" +
            "Years: 2006-2012\n\n" +
            "Achievements:\n" +
            "• 3× Pro Bowl with Falcons\n" +
            "• 68.5 sacks with Atlanta\n" +
            "• Elite pass rusher\n\n" +
            "GRADY JARRETT - DT (Current)\n" +
            "Years: 2015-present\n\n" +
            "Achievements:\n" +
            "• 5× Pro Bowl selection\n" +
            "• Defensive captain\n" +
            "• Team leader\n\n" +
            "═══════════════════════════════════════\n" +
            "LINEBACKERS\n" +
            "═══════════════════════════════════════\n\n" +
            "TOMMY NOBIS - LB\n" +
            "Ring of Honor\n" +
            "Years: 1966-1976\n\n" +
            "Achievements:\n" +
            "• 5× Pro Bowl selection\n" +
            "• 1966 NFL Rookie of the Year\n" +
            "• First-ever Falcons draft pick\n" +
            "• Known as 'Mr. Falcon'\n" +
            "• Jersey #60 retired\n\n" +
            "JESSIE TUGGLE - 'THE HAMMER'\n" +
            "Years: 1987-2000\n\n" +
            "Achievements:\n" +
            "• 5× Pro Bowl selection\n" +
            "• All-time leading tackler\n" +
            "• Ring of Honor inductee\n" +
            "• Undrafted free agent\n" +
            "  success story\n\n" +
            "KEITH BROOKING\n" +
            "Years: 1998-2008\n\n" +
            "Achievements:\n" +
            "• 5× Pro Bowl selection\n" +
            "• Team captain\n" +
            "• 1,188 career tackles";
        
        JOptionPane.showMessageDialog(null, def,
            "Defensive Line & Linebackers", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void showDefensiveBacks() {
        String dbs = "DEFENSIVE BACKS (CB/S)\n\n" +
            "═══════════════════════════════════════\n" +
            "CORNERBACKS\n" +
            "═══════════════════════════════════════\n\n" +
            "DEION SANDERS - 'PRIME TIME'\n" +
            "Hall of Famer (2011)\n" +
            "Years: 1989-1993 | Jersey #: 21\n" +
            "College: Florida State\n\n" +
            "Achievements with Falcons:\n" +
            "• First 5 NFL seasons in Atlanta\n" +
            "• 24 interceptions in 5 seasons\n" +
            "• Pro Bowl selection\n" +
            "• Return specialist and\n" +
            "  shutdown corner\n\n" +
            "Overall NFL Career:\n" +
            "• 8× Pro Bowl, 6× First-team\n" +
            "  All-Pro\n" +
            "• 2× Super Bowl Champion\n" +
            "• 1994 Defensive Player of Year\n\n" +
            "Two-Sport Star:\n" +
            "• Also played MLB (1989-2001)\n" +
            "• Only athlete in Super Bowl\n" +
            "  AND World Series\n" +
            "• Current Colorado head coach\n\n" +
            "Legacy:\n" +
            "• Greatest cornerback debate\n" +
            "• Revolutionized CB position\n" +
            "• Started legendary career\n" +
            "  in Atlanta\n\n" +
            "ROLANDO MCCLAIN\n" +
            "Years: 1988-1995\n" +
            "• Pro Bowl cornerback\n" +
            "• Solid coverage skills\n\n" +
            "═══════════════════════════════════════\n" +
            "SAFETIES\n" +
            "═══════════════════════════════════════\n\n" +
            "WILLIAM WHITE\n" +
            "Years: 1988-1999\n\n" +
            "Achievements:\n" +
            "• 2× Pro Bowl selection\n" +
            "• Franchise record 39 INTs\n" +
            "• Consistent playmaker\n\n" +
            "SCOTT CASE\n" +
            "Years: 1989-1994\n" +
            "• Pro Bowl selection (1993)\n" +
            "• Ball-hawking safety\n\n" +
            "JESSIE BATES III (Current)\n" +
            "Years: 2023-present\n\n" +
            "Achievements:\n" +
            "• All-Pro safety\n" +
            "• Big free agent signing\n" +
            "• Defensive leader";
        
        JOptionPane.showMessageDialog(null, dbs,
            "Defensive Backs", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void showHallOfFamers() {
        String hof = "<html><body style='width: 600px; background-color: #000000; color: #FFFFFF; font-family: Arial, sans-serif;'>" +
            "<div style='text-align: center; background-color: #A71930; padding: 10px; margin-bottom: 15px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>ATLANTA FALCONS HALL OF FAMERS</h2>" +
            "</div>" +
            "<table style='width: 100%; color: #FFFFFF; margin-bottom: 10px;'>" +
            "<tr>" +
            "<td style='width: 50%; padding: 10px; background-color: #1a1a1a; vertical-align: top;'>" +
            "<h3 style='color: #A71930; margin: 0 0 8px 0;'>DEION SANDERS</h3>" +
            "<p style='color: #A5ACAF; margin: 0; font-size: 13px;'>Cornerback • Jersey #21</p>" +
            "<p style='margin: 8px 0;'><b style='color: #A71930;'>Inducted:</b> 2011<br>" +
            "<b style='color: #A71930;'>Years:</b> 1989-1993</p>" +
            "</td>" +
            "<td style='width: 50%; padding: 10px; background-color: #1a1a1a; vertical-align: top;'>" +
            "<h3 style='color: #A71930; margin: 0 0 8px 0;'>CLAUDE HUMPHREY</h3>" +
            "<p style='color: #A5ACAF; margin: 0; font-size: 13px;'>Defensive End</p>" +
            "<p style='margin: 8px 0;'><b style='color: #A71930;'>Inducted:</b> 2014<br>" +
            "<b style='color: #A71930;'>Years:</b> 1968-1978</p>" +
            "<ul style='margin: 5px 0; padding-left: 20px; color: #FFFFFF; font-size: 12px;'>" +
            "<li>6× Pro Bowl</li>" +
            "<li>1968 Defensive ROY</li>" +
            "</ul>" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr>" +
            "<td style='width: 50%; padding: 10px; background-color: #1a1a1a; vertical-align: top;'>" +
            "<h3 style='color: #A71930; margin: 0 0 8px 0;'>TOMMY NOBIS</h3>" +
            "<p style='color: #A5ACAF; margin: 0; font-size: 13px;'>Linebacker • Jersey #60 (Retired)</p>" +
            "<p style='margin: 8px 0;'><b style='color: #A71930;'>Ring of Honor</b><br>" +
            "<b style='color: #A71930;'>Years:</b> 1966-1976</p>" +
            "<ul style='margin: 5px 0; padding-left: 20px; color: #FFFFFF; font-size: 12px;'>" +
            "<li>5× Pro Bowl</li>" +
            "<li>1966 NFL ROY</li>" +
            "<li>First Falcons draft pick</li>" +
            "<li>\"Mr. Falcon\"</li>" +
            "</ul>" +
            "</td>" +
            "<td style='width: 50%; padding: 10px; background-color: #1a1a1a; vertical-align: top;'>" +
            "<h3 style='color: #A71930; margin: 0 0 8px 0;'>TONY GONZALEZ</h3>" +
            "<p style='color: #A5ACAF; margin: 0; font-size: 13px;'>Tight End • Jersey #88</p>" +
            "<p style='margin: 8px 0;'><b style='color: #A71930;'>Inducted:</b> 2019<br>" +
            "<b style='color: #A71930;'>Years:</b> 2009-2013</p>" +
            "<ul style='margin: 5px 0; padding-left: 20px; color: #FFFFFF; font-size: 12px;'>" +
            "<li>5× Pro Bowl w/ Atlanta</li>" +
            "<li>Career: 1,325 rec</li>" +
            "<li>15,127 yards</li>" +
            "<li>Revolutionized TE position</li>" +
            "</ul>" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "<div style='text-align: center; margin-top: 15px; padding: 10px; background-color: #A71930;'>" +
            "<b style='color: #FFFFFF; font-size: 16px;'>RISE UP! 🦅</b>" +
            "</div>" +
            "</body></html>";
        
        JOptionPane.showMessageDialog(null, hof,
            "Hall of Famers", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
    
    
    
    
    private static void showCurrentTeam() {
        boolean inMenu = true;
        while (inMenu) {
            String[] teamOptions = {
                "Team Overview",
                "2026 Active Roster 🦅",
                "Back to Main Menu"
            };
            String teamChoice = (String) JOptionPane.showInputDialog(
                null,
                "<html><body style='width: 420px; background-color: #000000; color: #FFFFFF; font-family: Arial, sans-serif; text-align: center;'>"
                + "<div style='background-color: #A71930; padding: 12px; margin-bottom: 14px;'>"
                + "<h2 style='color: #FFFFFF; margin: 5px;'>🦅 CURRENT TEAM INFO</h2>"
                + "<p style='color: #FFFFFF; margin: 3px; font-size: 12px;'>2025–2026 Season</p>"
                + "</div>"
                + "<p style='color: #FFFFFF; font-size: 14px;'>What would you like to view?</p>"
                + "</body></html>",
                "Current Team Info",
                JOptionPane.QUESTION_MESSAGE,
                null, teamOptions, teamOptions[0]);
            if (teamChoice == null || teamChoice.equals("Back to Main Menu")) {
                inMenu = false;
            } else if (teamChoice.equals("Team Overview")) {
                String current =
                    "<html><body style='width: 550px; background-color: #000000; color: #FFFFFF; font-family: Arial, sans-serif;'>"
                    + "<div style='text-align: center; background-color: #A71930; padding: 10px; margin-bottom: 15px;'>"
                    + "<h2 style='color: #FFFFFF; margin: 5px;'>CURRENT TEAM (2025–2026)</h2>"
                    + "</div>"
                    + "<table style='width: 100%; color: #FFFFFF; margin-bottom: 15px;'>"
                    + "<tr>"
                    + "<td style='width: 50%; padding: 10px; background-color: #1a1a1a;'>"
                    + "<b style='color: #A71930;'>HEAD COACH</b><br>"
                    + "<span style='font-size: 16px;'>Raheem Morris</span>"
                    + "</td>"
                    + "<td style='width: 50%; padding: 10px; background-color: #1a1a1a;'>"
                    + "<b style='color: #A71930;'>GENERAL MANAGER</b><br>"
                    + "<span style='font-size: 16px;'>Terry Fontenot</span>"
                    + "</td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td style='padding: 10px; background-color: #1a1a1a;'>"
                    + "<b style='color: #A71930;'>OWNER</b><br>"
                    + "<span style='font-size: 16px;'>Arthur Blank</span>"
                    + "</td>"
                    + "<td style='padding: 10px; background-color: #1a1a1a;'>"
                    + "<b style='color: #A71930;'>MOTTO</b><br>"
                    + "<span style='font-size: 16px;'>\"Rise Up!\"</span>"
                    + "</td>"
                    + "</tr>"
                    + "</table>"
                    + "<hr style='border: 1px solid #A71930;'>"
                    + "<h3 style='color: #A71930; text-align: center; margin: 15px 0;'>KEY PLAYERS — 2026</h3>"
                    + "<table style='width: 100%; color: #FFFFFF;'>"
                    + "<tr>"
                    + "<td style='width: 50%; padding: 10px; vertical-align: top; background-color: #1a1a1a;'>"
                    + "<h4 style='color: #A71930; margin: 5px 0;'>OFFENSE</h4>"
                    + "<ul style='margin: 8px 0; padding-left: 20px;'>"
                    + "<li><b>QB:</b> Kirk Cousins #18</li>"
                    + "<li><b>RB:</b> Bijan Robinson #7</li>"
                    + "<li><b>WR:</b> Drake London #5</li>"
                    + "<li><b>WR:</b> Darnell Mooney #1</li>"
                    + "<li><b>TE:</b> Kyle Pitts #8</li>"
                    + "<li><b>OT:</b> Jake Matthews #70</li>"
                    + "<li><b>OG:</b> Chris Lindstrom #63</li>"
                    + "</ul>"
                    + "</td>"
                    + "<td style='width: 50%; padding: 10px; vertical-align: top; background-color: #1a1a1a;'>"
                    + "<h4 style='color: #A71930; margin: 5px 0;'>DEFENSE</h4>"
                    + "<ul style='margin: 8px 0; padding-left: 20px;'>"
                    + "<li><b>DE:</b> Leonard Floyd #56</li>"
                    + "<li><b>DE:</b> Jalon Walker #11</li>"
                    + "<li><b>DT:</b> David Onyemata #90</li>"
                    + "<li><b>LB:</b> Kaden Elliss #55</li>"
                    + "<li><b>CB:</b> A.J. Terrell #24</li>"
                    + "<li><b>FS:</b> Jessie Bates III #3</li>"
                    + "</ul>"
                    + "</td>"
                    + "</tr>"
                    + "</table>"
                    + "<hr style='border: 1px solid #A71930; margin: 15px 0;'>"
                    + "<div style='background-color: #1a1a1a; padding: 12px;'>"
                    + "<table style='width: 100%; color: #FFFFFF;'>"
                    + "<tr>"
                    + "<td style='width: 50%;'><b style='color: #A71930;'>Division:</b> NFC South</td>"
                    + "<td style='width: 50%;'><b style='color: #A71930;'>Location:</b> Atlanta, GA</td>"
                    + "</tr>"
                    + "</table>"
                    + "<p style='color: #A71930; font-weight: bold; margin: 10px 0 5px 0;'>Division Rivals:</p>"
                    + "<p style='color: #FFFFFF; margin: 5px 0;'>• New Orleans Saints<br>• Tampa Bay Buccaneers<br>• Carolina Panthers</p>"
                    + "</div>"
                    + "<div style='text-align: center; margin-top: 15px; padding: 10px; background-color: #A71930;'>"
                    + "<b style='color: #FFFFFF; font-size: 16px;'>RISE UP! 🦅</b>"
                    + "</div>"
                    + "</body></html>";
                JOptionPane.showMessageDialog(null, current, "Team Overview", JOptionPane.INFORMATION_MESSAGE);
            } else if (teamChoice.equals("2026 Active Roster 🦅")) {
                show2026Roster();
            }
        }
    }

    
    private static void takeQuiz() {
        int startQuiz = JOptionPane.showConfirmDialog(null,
            "<html><body style='width: 400px; background-color: #000000; color: #FFFFFF; text-align: center;'>" +
            "<div style='background-color: #A71930; padding: 10px; margin-bottom: 10px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>FALCONS QUIZ</h2>" +
            "</div>" +
            "<p style='color: #FFFFFF; font-size: 14px;'>Test your knowledge with 10 questions about<br>the Atlanta Falcons!</p>" +
            "<p style='color: #A5ACAF; margin-top: 15px;'>Ready to begin?</p>" +
            "<div style='margin-top: 10px; padding: 8px; background-color: #A71930;'>" +
            "<b style='color: #FFFFFF;'>RISE UP! 🦅</b>" +
            "</div>" +
            "</body></html>",
            "Falcons Quiz", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (startQuiz != JOptionPane.YES_OPTION) return;

        int score = 0;
        int totalQuestions = 10;

        // Q1
        String[] q1Opts = {"1965", "1966", "1967", "1970"};
        int q1 = JOptionPane.showOptionDialog(null, "Question 1/10: What year was the Atlanta Falcons franchise founded?",
            "Quiz - Question 1/10", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, q1Opts, q1Opts[0]);
        if (q1 == -1) return;
        if (q1 == 1) { score++; JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE); }
        else JOptionPane.showMessageDialog(null, "✗ Incorrect. Answer: 1966.", "Result", JOptionPane.INFORMATION_MESSAGE);

        // Q2
        String[] q2Opts = {"Jerry Jones", "Arthur Blank", "Robert Kraft", "Stan Kroenke"};
        int q2 = JOptionPane.showOptionDialog(null, "Question 2/10: Who is the current owner of the Atlanta Falcons?",
            "Quiz - Question 2/10", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, q2Opts, q2Opts[0]);
        if (q2 == -1) return;
        if (q2 == 1) { score++; JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE); }
        else JOptionPane.showMessageDialog(null, "✗ Incorrect. Answer: Arthur Blank.", "Result", JOptionPane.INFORMATION_MESSAGE);

        // Q3
        String[] q3Opts = {"Georgia Dome", "Mercedes-Benz Stadium", "Atlanta Stadium", "Turner Field"};
        int q3 = JOptionPane.showOptionDialog(null, "Question 3/10: What is the name of the Falcons' current home stadium?",
            "Quiz - Question 3/10", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, q3Opts, q3Opts[0]);
        if (q3 == -1) return;
        if (q3 == 1) { score++; JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE); }
        else JOptionPane.showMessageDialog(null, "✗ Incorrect. Answer: Mercedes-Benz Stadium.", "Result", JOptionPane.INFORMATION_MESSAGE);

        // Q4
        String[] q4Opts = {"0", "1", "2", "3"};
        int q4 = JOptionPane.showOptionDialog(null, "Question 4/10: How many Super Bowl appearances have the Falcons made?",
            "Quiz - Question 4/10", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, q4Opts, q4Opts[0]);
        if (q4 == -1) return;
        if (q4 == 2) { score++; JOptionPane.showMessageDialog(null, "✓ Correct! (1998 and 2016)", "Result", JOptionPane.INFORMATION_MESSAGE); }
        else JOptionPane.showMessageDialog(null, "✗ Incorrect. Answer: 2 (1998 and 2016).", "Result", JOptionPane.INFORMATION_MESSAGE);

        // Q5
        String[] q5Opts = {"Fly High!", "Rise Up!", "Bird Gang!", "In Flight!"};
        int q5 = JOptionPane.showOptionDialog(null, "Question 5/10: What is the Atlanta Falcons' team motto?",
            "Quiz - Question 5/10", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, q5Opts, q5Opts[0]);
        if (q5 == -1) return;
        if (q5 == 1) { score++; JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE); }
        else JOptionPane.showMessageDialog(null, "✗ Incorrect. Answer: Rise Up!", "Result", JOptionPane.INFORMATION_MESSAGE);

        // Q6
        String[] q6Opts = {"Red and Blue", "Red and Black", "Black and Gold", "Red and White"};
        int q6 = JOptionPane.showOptionDialog(null, "Question 6/10: What are the primary team colors of the Falcons?",
            "Quiz - Question 6/10", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, q6Opts, q6Opts[0]);
        if (q6 == -1) return;
        if (q6 == 1) { score++; JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE); }
        else JOptionPane.showMessageDialog(null, "✗ Incorrect. Answer: Red and Black.", "Result", JOptionPane.INFORMATION_MESSAGE);

        // Q7
        String[] q7Opts = {"The Home Depot", "Lowe's", "Walmart", "Target"};
        int q7 = JOptionPane.showOptionDialog(null, "Question 7/10: Arthur Blank was co-founder of which major retail company?",
            "Quiz - Question 7/10", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, q7Opts, q7Opts[0]);
        if (q7 == -1) return;
        if (q7 == 0) { score++; JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE); }
        else JOptionPane.showMessageDialog(null, "✗ Incorrect. Answer: The Home Depot.", "Result", JOptionPane.INFORMATION_MESSAGE);

        // Q8
        String[] q8Opts = {"2015", "2016", "2017", "2018"};
        int q8 = JOptionPane.showOptionDialog(null, "Question 8/10: What year did Mercedes-Benz Stadium open?",
            "Quiz - Question 8/10", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, q8Opts, q8Opts[0]);
        if (q8 == -1) return;
        if (q8 == 2) { score++; JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE); }
        else JOptionPane.showMessageDialog(null, "✗ Incorrect. Answer: 2017.", "Result", JOptionPane.INFORMATION_MESSAGE);

        // Q9
        String[] q9Opts = {"NFC East", "NFC North", "NFC South", "NFC West"};
        int q9 = JOptionPane.showOptionDialog(null, "Question 9/10: Which division do the Falcons play in?",
            "Quiz - Question 9/10", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, q9Opts, q9Opts[0]);
        if (q9 == -1) return;
        if (q9 == 2) { score++; JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE); }
        else JOptionPane.showMessageDialog(null, "✗ Incorrect. Answer: NFC South.", "Result", JOptionPane.INFORMATION_MESSAGE);

        // Q10
        String[] q10Opts = {"21-3", "24-3", "28-3", "31-3"};
        int q10 = JOptionPane.showOptionDialog(null, "Question 10/10: What was the Falcons' famous lead in Super Bowl LI before the comeback?",
            "Quiz - Question 10/10", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, q10Opts, q10Opts[0]);
        if (q10 == -1) return;
        if (q10 == 2) { score++; JOptionPane.showMessageDialog(null, "✓ Correct! The infamous 28-3 lead.", "Result", JOptionPane.INFORMATION_MESSAGE); }
        else JOptionPane.showMessageDialog(null, "✗ Incorrect. Answer: 28-3.", "Result", JOptionPane.INFORMATION_MESSAGE);

        // Final score
        double percentage = (score * 100.0) / totalQuestions;
        String grade, message;
        if      (percentage >= 90) { grade = "A - Outstanding!";    message = "🏆 Excellent! You're a true Falcons expert!"; }
        else if (percentage >= 80) { grade = "B - Great Job!";      message = "👏 Great work! You know your Falcons history!"; }
        else if (percentage >= 70) { grade = "C - Good Effort!";    message = "👍 Good job! Keep learning about the Falcons!"; }
        else if (percentage >= 60) { grade = "D - Keep Studying!";  message = "📚 Not bad! Review the info and try again!"; }
        else                       { grade = "F - Need More Study"; message = "📖 Keep reading! Explore the other sections!"; }

        JOptionPane.showMessageDialog(null,
            "<html><body style='width: 350px; background-color: #000000; color: #FFFFFF; text-align: center; font-family: Arial;'>" +
            "<div style='background-color: #A71930; padding: 10px; margin-bottom: 12px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>QUIZ COMPLETE!</h2></div>" +
            "<p style='font-size: 22px; color: #FFFFFF; margin: 8px 0;'>" + score + " / " + totalQuestions + "</p>" +
            "<p style='font-size: 15px; color: #A5ACAF; margin: 4px 0;'>" + String.format("%.0f", percentage) + "%</p>" +
            "<p style='font-size: 14px; color: #A71930; font-weight: bold; margin: 6px 0;'>" + grade + "</p>" +
            "<p style='color: #FFFFFF; margin: 10px 0;'>" + message + "</p>" +
            "<div style='background-color: #A71930; padding: 8px; margin-top: 10px;'>" +
            "<b style='color: #FFFFFF;'>RISE UP! 🦅</b></div>" +
            "</body></html>",
            "Quiz Results", JOptionPane.INFORMATION_MESSAGE);
    }


    // ─────────────────────────────────────────────
    //  2026 ACTIVE ROSTER DATA
    // ─────────────────────────────────────────────
    private static final String[][] ROSTER = {
        {"Dee Alford",        "#20", "CB",  "5'11\"", "180 lbs", "4 yrs",  "28", "N/A",                            "N/A"},
        {"Tyler Allgeier",    "#25", "RB",  "5'11\"", "225 lbs", "4 yrs",  "25", "Kaiser",                         "0.7397"},
        {"Jessie Bates III",  "#3",  "FS",  "6'1\"",  "210 lbs", "8 yrs",  "28", "Snider",                         "0.8153"},
        {"Matthew Bergeron",  "#65", "OG",  "6'5\"",  "315 lbs", "3 yrs",  "25", "Cegep Garneau",                  "0.8607"},
        {"JD Bertrand",       "#40", "LB",  "6'1\"",  "230 lbs", "2 yrs",  "25", "Blessed Trinity Catholic",       "0.8959"},
        {"Natrone Brooks",    "#35", "CB",  "5'11\"", "176 lbs", "2 yrs",  "26", "Starkville",                     "0.8056"},
        {"Cobee Bryant",      "#37", "CB",  "6'1\"",  "180 lbs", "0 yrs",  "24", "Hillcrest",                      "0.8781"},
        {"Nate Carter",       "#38", "RB",  "5'10\"", "202 lbs", "0 yrs",  "23", "Bishop Kearney",                 "0.7930"},
        {"Kirk Cousins",      "#18", "QB",  "6'3\"",  "205 lbs", "14 yrs", "37", "Holland Christian",              "0.8111"},
        {"Divine Deablo",     "#0",  "LB",  "6'3\"",  "223 lbs", "5 yrs",  "27", "Mount Tabor",                    "0.8786"},
        {"Brandon Dorlus",    "#54", "DE",  "6'3\"",  "295 lbs", "2 yrs",  "24", "Deerfield Beach",                "0.8656"},
        {"Dylan Drummond",    "#81", "WR",  "6'1\"",  "190 lbs", "1 yrs",  "26", "Cuyahoga Heights",               "0.7998"},
        {"Arnold Ebiketie",   "#17", "LB",  "6'2\"",  "250 lbs", "4 yrs",  "27", "Albert Einstein",                "0.8026"},
        {"Kaden Elliss",      "#55", "LB",  "6'2\"",  "240 lbs", "7 yrs",  "30", "N/A",                            "N/A"},
        {"Leonard Floyd",     "#56", "DE",  "6'3\"",  "240 lbs", "10 yrs", "33", "Dodge County",                   "0.9167"},
        {"Mike Ford",         "#28", "CB",  "6'1\"",  "199 lbs", "8 yrs",  "30", "N/A",                            "N/A"},
        {"Feleipe Franks",    "#84", "TE",  "6'6\"",  "241 lbs", "3 yrs",  "28", "Wakulla",                        "0.9732"},
        {"Elijah Garcia",     "#90", "DE",  "6'5\"",  "302 lbs", "2 yrs",  "27", "Stevens",                        "0.7893"},
        {"Zane Gonzalez",     "#45", "K",   "6'1\"",  "200 lbs", "8 yrs",  "30", "Deer Park",                      "N/A"},
        {"Jovaughn Gwyn",     "#52", "OG",  "6'2\"",  "310 lbs", "3 yrs",  "26", "Harding University High",        "0.8937"},
        {"Ronnie Harrison",   "#36", "LB",  "6'3\"",  "207 lbs", "8 yrs",  "28", "Florida State University School","0.9206"},
        {"Malik Heath",       "#18", "WR",  "6'2\"",  "213 lbs", "3 yrs",  "25", "Callaway",                       "0.8956"},
        {"C.J. Henderson",    "#39", "CB",  "6'1\"",  "204 lbs", "6 yrs",  "27", "Columbus",                       "0.9378"},
        {"Kyle Hinton",       "#68", "OG",  "6'2\"",  "315 lbs", "3 yrs",  "27", "N/A",                            "N/A"},
        {"Michael Jerrell",   "#72", "OT",  "6'5\"",  "309 lbs", "2 yrs",  "26", "Pike",                           "N/A"},
        {"Khalid Kareem",     "#92", "DE",  "6'4\"",  "255 lbs", "4 yrs",  "27", "Harrison",                       "0.9227"},
        {"Chris Lindstrom",   "#63", "OG",  "6'4\"",  "310 lbs", "7 yrs",  "28", "Shepherd Hill",                  "0.8467"},
        {"Drake London",      "#5",  "WR",  "6'4\"",  "215 lbs", "4 yrs",  "24", "Moorpark",                       "0.9087"},
        {"LaCale London",     "#94", "DT",  "6'3\"",  "297 lbs", "2 yrs",  "28", "N/A",                            "N/A"},
        {"Jake Matthews",     "#70", "OT",  "6'5\"",  "309 lbs", "12 yrs", "34", "Fort Bend Elkins",               "0.9810"},
        {"Liam McCullough",   "#49", "LS",  "6'2\"",  "245 lbs", "4 yrs",  "28", "N/A",                            "N/A"},
        {"Darnell Mooney",    "#1",  "WR",  "5'11\"", "180 lbs", "6 yrs",  "28", "Gaston Sch",                     "0.7883"},
        {"Jack Nelson",       "#69", "OT",  "6'7\"",  "314 lbs", "0 yrs",  "24", "Stoughton",                      "0.9539"},
        {"Ryan Neuzil",       "#64", "C",   "6'3\"",  "305 lbs", "4 yrs",  "28", "Braden River",                   "0.7583"},
        {"David Onyemata",    "#90", "DT",  "6'4\"",  "310 lbs", "10 yrs", "33", "N/A",                            "N/A"},
        {"Ruke Orhorhoro",    "#98", "DT",  "6'4\"",  "294 lbs", "2 yrs",  "24", "River Rouge",                    "0.8707"},
        {"James Pearce Jr.",  "#27", "DE",  "6'5\"",  "242 lbs", "0 yrs",  "22", "Chambers",                       "0.9205"},
        {"Bradley Pinion",    "#13", "P",   "6'5\"",  "265 lbs", "11 yrs", "31", "Northwest Cabarrus",             "0.8540"},
        {"Kyle Pitts",        "#8",  "TE",  "6'6\"",  "250 lbs", "5 yrs",  "25", "Archbishop Wood",                "0.9334"},
        {"Teagan Quitoriano", "#85", "TE",  "6'6\"",  "259 lbs", "4 yrs",  "25", "Sprague",                        "0.8546"},
        {"Bijan Robinson",    "#7",  "RB",  "5'11\"", "215 lbs", "3 yrs",  "24", "Salpointe Catholic",             "0.9928"},
        {"Jammie Robinson",   "#35", "SAF", "5'11\"", "195 lbs", "3 yrs",  "25", "Lee County",                     "0.8933"},
        {"David Sills",       "#87", "WR",  "6'3\"",  "211 lbs", "3 yrs",  "30", "Eastern Christian",              "0.8528"},
        {"Easton Stick",      "#12", "QB",  "6'1\"",  "224 lbs", "6 yrs",  "30", "Creighton Prep",                 "0.7778"},
        {"Kentavius Street",  "#93", "DE",  "6'2\"",  "315 lbs", "7 yrs",  "29", "J.H. Rose",                      "0.9517"},
        {"A.J. Terrell",      "#24", "CB",  "6'1\"",  "200 lbs", "6 yrs",  "27", "Westlake",                       "0.9745"},
        {"Deven Thompkins",   "#13", "WR",  "5'8\"",  "155 lbs", "4 yrs",  "26", "Dunbar",                         "0.7497"},
        {"Jalon Walker",      "#11", "DE",  "6'2\"",  "245 lbs", "0 yrs",  "21", "Salisbury",                      "0.9803"},
        {"Casey Washington",  "#82", "WR",  "6'1\"",  "205 lbs", "2 yrs",  "24", "Pflugerville",                   "0.8359"},
        {"Xavier Watts",      "#31", "SAF", "6'1\"",  "203 lbs", "0 yrs",  "24", "Burke",                          "0.8926"},
        {"Elijah Wilkinson",  "#71", "OT",  "6'6\"",  "310 lbs", "9 yrs",  "31", "Downingtown West",               "0.7783"},
        {"Charlie Woerner",   "#89", "TE",  "6'5\"",  "250 lbs", "6 yrs",  "28", "Rabun County",                   "0.9386"},
        {"Josh Woods",        "#42", "LB",  "6'1\"",  "235 lbs", "6 yrs",  "29", "McDonogh School",                "0.8525"}
    };

    private static void show2026Roster() {
        // Build a proper JFrame window with a scrollable table + live search bar
        javax.swing.JFrame frame = new javax.swing.JFrame("🦅 2026 Atlanta Falcons Active Roster");
        frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(860, 600);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null); // center on screen

        java.awt.Color red       = new java.awt.Color(0xA7, 0x19, 0x30);
        java.awt.Color black     = new java.awt.Color(0x0D, 0x0D, 0x0D);
        java.awt.Color darkGray  = new java.awt.Color(0x1A, 0x1A, 0x1A);
        java.awt.Color altGray   = new java.awt.Color(0x25, 0x25, 0x25);
        java.awt.Color silver    = new java.awt.Color(0xA5, 0xAC, 0xAF);
        java.awt.Color white     = java.awt.Color.WHITE;

        // ── Header panel ──────────────────────────────────────────────────────
        javax.swing.JPanel header = new javax.swing.JPanel(new java.awt.BorderLayout());
        header.setBackground(red);
        header.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));

        javax.swing.JLabel title = new javax.swing.JLabel("🦅  2026 ATLANTA FALCONS  —  ACTIVE ROSTER  (" + ROSTER.length + " Players)", javax.swing.SwingConstants.CENTER);
        title.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 17));
        title.setForeground(white);
        header.add(title, java.awt.BorderLayout.CENTER);

        // ── Search bar panel ──────────────────────────────────────────────────
        javax.swing.JPanel searchPanel = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 12, 8));
        searchPanel.setBackground(darkGray);
        searchPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, red));

        javax.swing.JLabel searchIcon = new javax.swing.JLabel("🔍  Search:");
        searchIcon.setForeground(silver);
        searchIcon.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 13));

        javax.swing.JTextField searchField = new javax.swing.JTextField(22);
        searchField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 13));
        searchField.setBackground(new java.awt.Color(0x33, 0x33, 0x33));
        searchField.setForeground(white);
        searchField.setCaretColor(white);
        searchField.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createLineBorder(red, 1),
            javax.swing.BorderFactory.createEmptyBorder(4, 6, 4, 6)));

        javax.swing.JLabel posLabel = new javax.swing.JLabel("  Position:");
        posLabel.setForeground(silver);
        posLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 13));

        java.util.LinkedHashSet<String> posSet = new java.util.LinkedHashSet<>();
        posSet.add("ALL");
        for (String[] p : ROSTER) posSet.add(p[2]);
        javax.swing.JComboBox<String> posFilter = new javax.swing.JComboBox<>(posSet.toArray(new String[0]));
        posFilter.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
        posFilter.setBackground(new java.awt.Color(0x33, 0x33, 0x33));
        posFilter.setForeground(white);

        javax.swing.JLabel countLabel = new javax.swing.JLabel("  Showing: " + ROSTER.length + " players");
        countLabel.setForeground(silver);
        countLabel.setFont(new java.awt.Font("Arial", java.awt.Font.ITALIC, 12));

        searchPanel.add(searchIcon);
        searchPanel.add(searchField);
        searchPanel.add(posLabel);
        searchPanel.add(posFilter);
        searchPanel.add(countLabel);

        // ── Table ─────────────────────────────────────────────────────────────
        String[] columns = {"Player", "#", "Pos", "Height", "Weight", "Exp", "Age", "H.S.", "Rating"};
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int r, int c) { return false; }
        };
        for (String[] p : ROSTER) {
            model.addRow(new Object[]{p[0], p[1], p[2], p[3], p[4], p[5], p[6], p[7], p[8]});
        }

        javax.swing.JTable table = new javax.swing.JTable(model);
        table.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 13));
        table.setBackground(darkGray);
        table.setForeground(white);
        table.setSelectionBackground(red);
        table.setSelectionForeground(white);
        table.setGridColor(new java.awt.Color(0x3A, 0x3A, 0x3A));
        table.setRowHeight(24);
        table.setShowVerticalLines(true);
        table.setAutoCreateRowSorter(true);
        table.setFillsViewportHeight(true);

        // Column header styling
        javax.swing.table.JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setBackground(red);
        tableHeader.setForeground(white);
        tableHeader.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 13));
        tableHeader.setReorderingAllowed(false);

        // Column widths
        int[] widths = {160, 40, 45, 55, 65, 45, 40, 140, 65};
        for (int i = 0; i < widths.length; i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(widths[i]);
        }

        // Alternating row colors via custom renderer
        javax.swing.table.DefaultTableCellRenderer cellRenderer = new javax.swing.table.DefaultTableCellRenderer() {
            public java.awt.Component getTableCellRendererComponent(
                    javax.swing.JTable t, Object val, boolean sel, boolean focus, int row, int col) {
                super.getTableCellRendererComponent(t, val, sel, focus, row, col);
                if (sel) {
                    setBackground(red);
                    setForeground(white);
                } else {
                    setBackground(row % 2 == 0 ? darkGray : altGray);
                    // Highlight position column in red
                    setForeground(col == 2 ? red : white);
                    if (col == 2) setFont(getFont().deriveFont(java.awt.Font.BOLD));
                    else setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 13));
                }
                setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
                return this;
            }
        };
        for (int i = 0; i < columns.length; i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }

        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(table);
        scrollPane.getViewport().setBackground(darkGray);
        scrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        // ── Footer ────────────────────────────────────────────────────────────
        javax.swing.JPanel footer = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
        footer.setBackground(red);
        javax.swing.JLabel footerLabel = new javax.swing.JLabel("RISE UP! 🦅  |  Click any column header to sort");
        footerLabel.setForeground(white);
        footerLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
        footer.add(footerLabel);

        // ── Live search & filter logic ────────────────────────────────────────
        javax.swing.event.DocumentListener searchListener = new javax.swing.event.DocumentListener() {
            private void filter() {
                String text  = searchField.getText().trim().toLowerCase();
                String pos   = (String) posFilter.getSelectedItem();
                model.setRowCount(0);
                int shown = 0;
                for (String[] p : ROSTER) {
                    boolean nameMatch = text.isEmpty() || p[0].toLowerCase().contains(text) || p[1].toLowerCase().contains(text);
                    boolean posMatch  = "ALL".equals(pos) || p[2].equals(pos);
                    if (nameMatch && posMatch) {
                        model.addRow(new Object[]{p[0], p[1], p[2], p[3], p[4], p[5], p[6], p[7], p[8]});
                        shown++;
                    }
                }
                countLabel.setText("  Showing: " + shown + " player" + (shown == 1 ? "" : "s"));
            }
            public void insertUpdate(javax.swing.event.DocumentEvent e)  { filter(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e)  { filter(); }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { filter(); }
        };
        searchField.getDocument().addDocumentListener(searchListener);
        posFilter.addActionListener(e -> {
            String text = searchField.getText().trim().toLowerCase();
            String pos  = (String) posFilter.getSelectedItem();
            model.setRowCount(0);
            int shown = 0;
            for (String[] p : ROSTER) {
                boolean nameMatch = text.isEmpty() || p[0].toLowerCase().contains(text) || p[1].toLowerCase().contains(text);
                boolean posMatch  = "ALL".equals(pos) || p[2].equals(pos);
                if (nameMatch && posMatch) {
                    model.addRow(new Object[]{p[0], p[1], p[2], p[3], p[4], p[5], p[6], p[7], p[8]});
                    shown++;
                }
            }
            countLabel.setText("  Showing: " + shown + " player" + (shown == 1 ? "" : "s"));
        });

        // ── Assemble ──────────────────────────────────────────────────────────
        javax.swing.JPanel topPanel = new javax.swing.JPanel(new java.awt.BorderLayout());
        topPanel.add(header, java.awt.BorderLayout.NORTH);
        topPanel.add(searchPanel, java.awt.BorderLayout.SOUTH);

        frame.getContentPane().setBackground(black);
        frame.getContentPane().add(topPanel, java.awt.BorderLayout.NORTH);
        frame.getContentPane().add(scrollPane, java.awt.BorderLayout.CENTER);
        frame.getContentPane().add(footer, java.awt.BorderLayout.SOUTH);

        frame.setVisible(true);

        // Block until window is closed so the main menu waits
        try {
            while (frame.isVisible()) { Thread.sleep(200); }
        } catch (InterruptedException ignored) {}
    }
}

// ══════════════════════════════════════════════════════════════════════════════
//  FALCONS FOOTBALL GAME
// ══════════════════════════════════════════════════════════════════════════════
class FalconsFootballGame {

    static final java.awt.Color RED     = new java.awt.Color(0xA7, 0x19, 0x30);
    static final java.awt.Color BLACK   = new java.awt.Color(0x0D, 0x0D, 0x0D);
    static final java.awt.Color DARK    = new java.awt.Color(0x1A, 0x1A, 0x1A);
    static final java.awt.Color WHITE   = java.awt.Color.WHITE;
    static final java.awt.Color SILVER  = new java.awt.Color(0xA5, 0xAC, 0xAF);

    // Columns: name, number, position, speed, power, awareness, catching, coverage
    static final String[][] PLAYERS = {
        {"Kirk Cousins",      "18","QB", "55","60","88","0","0"},
        {"Easton Stick",      "12","QB", "65","55","75","0","0"},
        {"Bijan Robinson",    "7", "RB", "92","85","82","80","0"},
        {"Tyler Allgeier",    "25","RB", "82","80","72","72","0"},
        {"Nate Carter",       "38","RB", "88","72","65","68","0"},
        {"Drake London",      "5", "WR", "84","80","85","91","0"},
        {"Darnell Mooney",    "1", "WR", "91","65","80","87","0"},
        {"Malik Heath",       "18","WR", "85","70","76","82","0"},
        {"Deven Thompkins",   "13","WR", "95","55","72","85","0"},
        {"Dylan Drummond",    "81","WR", "86","60","68","78","0"},
        {"David Sills",       "87","WR", "80","68","74","82","0"},
        {"Casey Washington",  "82","WR", "83","62","70","79","0"},
        {"Kyle Pitts",        "8", "TE", "80","82","84","90","0"},
        {"Feleipe Franks",    "84","TE", "72","85","75","84","0"},
        {"Teagan Quitoriano", "85","TE", "70","83","72","80","0"},
        {"Charlie Woerner",   "89","TE", "68","78","70","76","0"},
        {"Jake Matthews",     "70","OT", "55","92","88","0","0"},
        {"Chris Lindstrom",   "63","OG", "52","90","86","0","0"},
        {"Matthew Bergeron",  "65","OG", "55","88","82","0","0"},
        {"Ryan Neuzil",       "64","C",  "50","86","80","0","0"},
        {"Jack Nelson",       "69","OT", "54","87","75","0","0"},
        {"Leonard Floyd",     "56","DE", "80","85","84","0","82"},
        {"Jalon Walker",      "11","DE", "88","82","78","0","80"},
        {"Khalid Kareem",     "92","DE", "76","88","82","0","84"},
        {"Kentavius Street",  "93","DE", "74","90","80","0","82"},
        {"Brandon Dorlus",    "54","DE", "72","86","74","0","76"},
        {"James Pearce Jr.",  "27","DE", "90","80","72","0","78"},
        {"David Onyemata",    "90","DT", "60","92","82","0","80"},
        {"Ruke Orhorhoro",    "98","DT", "62","90","80","0","79"},
        {"LaCale London",     "94","DT", "58","88","76","0","76"},
        {"JD Bertrand",       "40","LB", "78","82","80","0","82"},
        {"Kaden Elliss",      "55","LB", "74","84","82","0","80"},
        {"Arnold Ebiketie",   "17","LB", "80","80","78","0","82"},
        {"Divine Deablo",     "0", "LB", "80","78","80","0","84"},
        {"Josh Woods",        "42","LB", "76","80","78","0","80"},
        {"Ronnie Harrison",   "36","LB", "78","78","82","0","84"},
        {"A.J. Terrell",      "24","CB", "90","72","86","0","92"},
        {"Dee Alford",        "20","CB", "86","68","80","0","84"},
        {"Natrone Brooks",    "35","CB", "84","65","76","0","80"},
        {"Cobee Bryant",      "37","CB", "88","65","74","0","82"},
        {"C.J. Henderson",    "39","CB", "86","70","82","0","88"},
        {"Mike Ford",         "28","CB", "84","68","78","0","80"},
        {"Jessie Bates III",  "3", "FS", "84","74","90","0","90"},
        {"Jammie Robinson",   "35","SAF","86","72","84","0","86"},
        {"Xavier Watts",      "31","SAF","82","74","80","0","84"},
        {"Zane Gonzalez",     "45","K",  "60","70","80","0","0"},
        {"Bradley Pinion",    "13","P",  "58","65","75","0","0"},
        {"Liam McCullough",   "49","LS", "55","70","72","0","0"},
    };

    static final int SPD=3, PWR=4, AWR=5, CAT=6, COV=7;
    static java.util.Random RNG = new java.util.Random();

    static void launch() {
        String[] modes = {"Offense — Drive for a Touchdown", "Defense — Stop the Offense"};
        String mode = (String) javax.swing.JOptionPane.showInputDialog(
            null,
            "<html><body style='width:380px;background:#0D0D0D;color:#FFF;text-align:center;font-family:Arial;'>" +
            "<div style='background:#A71930;padding:14px;margin-bottom:12px;'>" +
            "<h2 style='color:#FFF;margin:4px;'>🏈 FALCONS FOOTBALL GAME</h2>" +
            "<p style='color:#FFF;font-size:12px;margin:2px;'>100-Yard Drive Simulator</p></div>" +
            "<p style='color:#FFF;font-size:14px;'>Choose your role:</p>" +
            "</body></html>",
            "Falcons Football Game",
            javax.swing.JOptionPane.QUESTION_MESSAGE,
            null, modes, modes[0]);
        if (mode == null) return;
        if (mode.startsWith("Offense")) playOffense();
        else playDefense();
    }

    static void playOffense() {
        int yard = 0, down = 1, toGo = 10, plays = 0;
        StringBuilder log = new StringBuilder();

        String[][] qbs = filterByPos("QB");
        String[] qbNames = new String[qbs.length];
        for (int i = 0; i < qbs.length; i++) qbNames[i] = qbs[i][0] + "  (#" + qbs[i][1] + ")  AWR:" + qbs[i][AWR];
        String qbPick = (String) javax.swing.JOptionPane.showInputDialog(
            null, hdr("Choose Your QB — Offense"),
            "Select QB", javax.swing.JOptionPane.QUESTION_MESSAGE, null, qbNames, qbNames[0]);
        if (qbPick == null) return;
        String[] qb = qbs[indexOf(qbNames, qbPick)];

        while (yard < 100) {
            String[] playOptions = {
                "Pass — Short (5-12 yds)",
                "Pass — Deep (15-35 yds)",
                "Run — Inside",
                "Run — Outside (Sweep)"
            };
            String playPick = (String) javax.swing.JOptionPane.showInputDialog(null,
                "<html><body style='width:440px;background:#0D0D0D;color:#FFF;font-family:Arial;'>" +
                "<div style='background:#A71930;padding:10px;text-align:center;margin-bottom:8px;'>" +
                "<b style='font-size:16px;color:#FFF;'>🏈 OFFENSE — DRIVE FOR TD</b></div>" +
                "<pre style='color:#7EC87E;font-size:11px;font-family:monospace;background:#0a200a;padding:6px;border:1px solid #228B22;border-radius:4px;'>" + field(yard) + "</pre>" +
                "<table style='width:100%;color:#FFF;font-size:13px;border-collapse:collapse;'>" +
                "<tr style='background:#1A1A1A;'><td style='padding:4px 8px;'><b style='color:#A71930;'>Down &amp; Distance:</b></td><td style='padding:4px;'><b>" + ord(down) + " &amp; " + toGo + "</b></td></tr>" +
                "<tr><td style='padding:4px 8px;'><b style='color:#A71930;'>Ball on:</b></td><td style='padding:4px;'>Own " + yard + " yard line</td></tr>" +
                "<tr style='background:#1A1A1A;'><td style='padding:4px 8px;'><b style='color:#A71930;'>QB:</b></td><td style='padding:4px;'>" + qb[0] + " #" + qb[1] + " | AWR:" + qb[AWR] + " SPD:" + qb[SPD] + "</td></tr>" +
                "</table>" +
                "<div style='margin:8px 0;padding:6px;background:#111;border-left:3px solid #A71930;font-size:11px;color:#A5ACAF;'>" + lastLines(log.toString(),3) + "</div>" +
                "<p style='color:#FFF;font-size:13px;'>📋 Call a play:</p>" +
                "</body></html>",
                ord(down) + " & " + toGo, javax.swing.JOptionPane.QUESTION_MESSAGE,
                null, playOptions, playOptions[0]);
            if (playPick == null) return;

            String[][] skillPool = playPick.startsWith("Pass") ? filterByPos("WR","TE") : filterByPos("RB");
            String role = playPick.startsWith("Pass") ? "Target Receiver" : "Ball Carrier";
            String[] skillNames = new String[skillPool.length];
            for (int i = 0; i < skillPool.length; i++) {
                String[] p = skillPool[i];
                skillNames[i] = p[0] + " (" + p[2] + " #" + p[1] + ")  SPD:" + p[SPD] + " CAT:" + p[CAT];
            }
            String skillPick = (String) javax.swing.JOptionPane.showInputDialog(
                null, hdr("Choose " + role),
                role, javax.swing.JOptionPane.QUESTION_MESSAGE, null, skillNames, skillNames[0]);
            if (skillPick == null) return;
            String[] skill = skillPool[indexOf(skillNames, skillPick)];

            int[] res = simOff(playPick, qb, skill);
            int gain = res[0]; boolean to = res[1]==1, sack = res[2]==1;
            plays++;

            String desc;
            if (to) {
                desc = "TURNOVER! " + qb[0] + " — ball lost!";
                log.append("\n").append(ord(down)).append("&").append(toGo).append(": ").append(desc);
                javax.swing.JOptionPane.showMessageDialog(null, result("💔 TURNOVER!", desc + "\nThe defense takes the ball. Drive ended.", false), "Turnover!", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            } else if (sack) {
                gain = -(3 + RNG.nextInt(8));
                desc = "SACK! " + qb[0] + " goes down for " + Math.abs(gain) + " yds.";
            } else if (playPick.startsWith("Pass")) {
                desc = qb[0] + " finds " + skill[0] + " for " + gain + " yards.";
            } else {
                desc = skill[0] + " rushes for " + gain + " yards.";
            }
            yard = Math.max(0, yard + gain);
            toGo = Math.max(0, toGo - gain);
            log.append("\n").append(ord(down)).append("&").append((toGo+gain)).append(": ").append(desc);

            if (yard >= 100) {
                javax.swing.JOptionPane.showMessageDialog(null,
                    result("🎉 TOUCHDOWN! RISE UP! 🦅",
                        skill[0] + " punches it in!\n\nQB: " + qb[0] + "\nPlays: " + plays + "\n\nRISE UP! 🦅", true),
                    "TOUCHDOWN!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (toGo <= 0) {
                down = 1; toGo = Math.min(10, 100 - yard);
                javax.swing.JOptionPane.showMessageDialog(null, result("✅ FIRST DOWN!", desc + "\n\nNew set of downs! Ball on own " + yard + " yd line.", true), "First Down!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                down++;
                if (down > 4) {
                    javax.swing.JOptionPane.showMessageDialog(null, result("😔 TURNOVER ON DOWNS", "Failed to convert on 4th down.\nDrive ended at own " + yard + " yd line.\nTotal plays: " + plays, false), "Downs", javax.swing.JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }
    }

    static void playDefense() {
        int yard = 20, down = 1, toGo = 10, plays = 0;
        StringBuilder log = new StringBuilder();

        String[][] defs = filterByPos("CB","LB","DE","FS","SAF","DT");
        String[] defNames = new String[defs.length];
        for (int i = 0; i < defs.length; i++) {
            String[] p = defs[i];
            defNames[i] = p[0] + " (" + p[2] + " #" + p[1] + ")  COV:" + p[COV] + " SPD:" + p[SPD] + " PWR:" + p[PWR];
        }
        String defPick = (String) javax.swing.JOptionPane.showInputDialog(
            null, hdr("Choose Your Defensive Player"),
            "Select Defender", javax.swing.JOptionPane.QUESTION_MESSAGE, null, defNames, defNames[0]);
        if (defPick == null) return;
        String[] def = defs[indexOf(defNames, defPick)];

        while (yard < 100) {
            String[] defPlays = {
                "Blitz — Rush the QB",
                "Zone Cover — Drop into zone",
                "Man Coverage — Shadow receiver",
                "Spy — Watch for scramble"
            };
            String defCall = (String) javax.swing.JOptionPane.showInputDialog(null,
                "<html><body style='width:440px;background:#0D0D0D;color:#FFF;font-family:Arial;'>" +
                "<div style='background:#1A3A6A;padding:10px;text-align:center;margin-bottom:8px;'>" +
                "<b style='font-size:16px;color:#FFF;'>🛡️ DEFENSE — STOP THE OFFENSE</b></div>" +
                "<pre style='color:#7EC87E;font-size:11px;font-family:monospace;background:#0a200a;padding:6px;border:1px solid #228B22;border-radius:4px;'>" + field(yard) + "</pre>" +
                "<table style='width:100%;color:#FFF;font-size:13px;border-collapse:collapse;'>" +
                "<tr style='background:#1A1A1A;'><td style='padding:4px 8px;'><b style='color:#6AADFF;'>Down &amp; Distance:</b></td><td style='padding:4px;'><b>" + ord(down) + " &amp; " + toGo + "</b></td></tr>" +
                "<tr><td style='padding:4px 8px;'><b style='color:#6AADFF;'>Ball on:</b></td><td style='padding:4px;'>Opp " + yard + " yard line</td></tr>" +
                "<tr style='background:#1A1A1A;'><td style='padding:4px 8px;'><b style='color:#6AADFF;'>Your Player:</b></td><td style='padding:4px;'>" + def[0] + " #" + def[1] + " | COV:" + def[COV] + " SPD:" + def[SPD] + " PWR:" + def[PWR] + "</td></tr>" +
                "</table>" +
                "<div style='margin:8px 0;padding:6px;background:#111;border-left:3px solid #1A3A6A;font-size:11px;color:#A5ACAF;'>" + lastLines(log.toString(),3) + "</div>" +
                "<p style='color:#FFF;font-size:13px;'>🛡️ Choose your defensive call:</p>" +
                "</body></html>",
                ord(down) + " & " + toGo, javax.swing.JOptionPane.QUESTION_MESSAGE,
                null, defPlays, defPlays[0]);
            if (defCall == null) return;

            int[] res = simDef(defCall, def);
            int gain = res[0]; boolean to = res[1]==1, sack = res[2]==1, inc = res[3]==1;
            plays++;

            String desc;
            if (to) {
                desc = "INTERCEPTION / FUMBLE by " + def[0] + "! Falcons ball!";
                log.append("\n").append(ord(down)).append("&").append(toGo).append(": ").append(desc);
                javax.swing.JOptionPane.showMessageDialog(null, result("🦅 TURNOVER! RISE UP!", desc + "\n\nYou forced a turnover — Falcons take over!", true), "Turnover!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (sack) {
                gain = -(3 + RNG.nextInt(8));
                desc = "SACK by " + def[0] + "! Loss of " + Math.abs(gain) + " yards!";
            } else if (inc) {
                gain = 0; desc = "Incomplete pass! " + def[0] + " breaks it up!";
            } else if (gain <= 2) {
                desc = def[0] + " makes the stop! Gain of only " + gain + " yds.";
            } else {
                desc = "Offense gains " + gain + " yards.";
            }
            yard = Math.max(0, yard + gain);
            toGo = Math.max(0, toGo - gain);
            log.append("\n").append(ord(down)).append("&").append((toGo+gain)).append(": ").append(desc);

            if (yard >= 100) {
                javax.swing.JOptionPane.showMessageDialog(null, result("😔 TOUCHDOWN ALLOWED", "The offense scored.\nYour player: " + def[0] + "\nTotal plays: " + plays + "\n\nBetter luck next drive.", false), "TD Allowed", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (toGo <= 0) {
                down = 1; toGo = Math.min(10, 100 - yard);
                javax.swing.JOptionPane.showMessageDialog(null, result("📣 Offense First Down", desc + "\n\nOffense moves to opp " + yard + " yd line.", false), "First Down", javax.swing.JOptionPane.WARNING_MESSAGE);
            } else {
                down++;
                if (down > 4) {
                    javax.swing.JOptionPane.showMessageDialog(null, result("🦅 STOP ON DOWNS! RISE UP!", "Offense failed to convert!\nYou held them at opp " + yard + " yd line!\nTotal plays: " + plays, true), "Defensive Stop!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
        }
    }

    // returns [gain, turnover, sack]
    static int[] simOff(String play, String[] qb, String[] skill) {
        int qbAwr = Integer.parseInt(qb[AWR]), qbSpd = Integer.parseInt(qb[SPD]);
        int sklSpd = Integer.parseInt(skill[SPD]), sklCat = Integer.parseInt(skill[CAT]), sklPwr = Integer.parseInt(skill[PWR]);
        if (play.contains("Deep")  && RNG.nextInt(100) < 12) return new int[]{0,0,1};
        if (play.contains("Short") && RNG.nextInt(100) < 6)  return new int[]{0,0,1};
        int toChance = play.contains("Deep") ? 8 : play.contains("Short") ? 4 : 3;
        if (RNG.nextInt(100) < toChance) return new int[]{0,1,0};
        int gain;
        if      (play.contains("Short"))  gain = 4  + RNG.nextInt(9)  + (qbAwr + sklCat) / 26;
        else if (play.contains("Deep"))   gain = 10 + RNG.nextInt(26) + (sklSpd + sklCat) / 22;
        else if (play.contains("Inside")) gain = RNG.nextInt(9) + (sklPwr + sklSpd) / 24;
        else                              gain = RNG.nextInt(14) + (sklSpd * 2) / 24;
        return new int[]{Math.max(-1, gain - 2), 0, 0};
    }

    // returns [gain, turnover, sack, incomplete]
    static int[] simDef(String call, String[] def) {
        int cov = Integer.parseInt(def[COV]), spd = Integer.parseInt(def[SPD]);
        int pwr = Integer.parseInt(def[PWR]), awr = Integer.parseInt(def[AWR]);
        if (RNG.nextInt(100) < (call.contains("Man") ? cov/15 : call.contains("Zone") ? cov/18 : 3)) return new int[]{0,1,0,0};
        if (call.contains("Blitz") && RNG.nextInt(100) < 20 + (pwr+spd)/10) return new int[]{0,0,1,0};
        int incThresh = call.contains("Man") ? 20+cov/10 : call.contains("Zone") ? 15+cov/12 : call.contains("Spy") ? 12+awr/14 : 8;
        if (RNG.nextInt(100) < incThresh) return new int[]{0,0,0,1};
        int base = call.contains("Blitz") ? 8+RNG.nextInt(14) : call.contains("Man") ? 3+RNG.nextInt(10) : call.contains("Zone") ? 4+RNG.nextInt(12) : 5+RNG.nextInt(10);
        return new int[]{Math.max(0, base - (cov+spd)/25), 0, 0, 0};
    }

    static String field(int yard) {
        // 51 chars = 0..100, each char = ~2 yards
        StringBuilder sb = new StringBuilder();
        sb.append("EZ|");
        int ballPos = yard / 2;
        for (int i = 0; i < 50; i++) {
            if (i == ballPos)      sb.append("O");   // ball
            else if (i % 10 == 0) sb.append("|");
            else if (i % 5 == 0)  sb.append(":");
            else                   sb.append(".");
        }
        sb.append("|EZ\n");
        sb.append("0   10   20   30   40   50   60   70   80   90  100");
        return sb.toString();
    }

    static String[][] filterByPos(String... positions) {
        java.util.Set<String> set = new java.util.HashSet<>(java.util.Arrays.asList(positions));
        java.util.List<String[]> out = new java.util.ArrayList<>();
        for (String[] p : PLAYERS) if (set.contains(p[2])) out.add(p);
        return out.toArray(new String[0][]);
    }

    static int indexOf(String[] arr, String val) {
        for (int i = 0; i < arr.length; i++) if (arr[i].equals(val)) return i;
        return 0;
    }

    static String ord(int n) {
        return n==1?"1st":n==2?"2nd":n==3?"3rd":n+"th";
    }

    static String lastLines(String s, int n) {
        if (s.isEmpty()) return "— No plays yet —";
        String[] lines = s.split("\n");
        StringBuilder sb = new StringBuilder();
        for (int i = Math.max(0, lines.length-n); i < lines.length; i++)
            if (!lines[i].isEmpty()) sb.append(lines[i]).append("<br>");
        return sb.length()==0 ? "—" : sb.toString();
    }

    static String hdr(String t) {
        return "<html><body style='width:380px;background:#0D0D0D;color:#FFF;text-align:center;font-family:Arial;'>" +
               "<div style='background:#A71930;padding:12px;margin-bottom:10px;'>" +
               "<h3 style='color:#FFF;margin:4px;'>🏈 " + t + "</h3></div></body></html>";
    }

    static String result(String heading, String body, boolean win) {
        String bg = win ? "#0D3B0D" : "#3B0D0D";
        String bd = win ? "#5DBB63" : "#FF6B6B";
        return "<html><body style='width:400px;background:#0D0D0D;color:#FFF;font-family:Arial;text-align:center;'>" +
               "<div style='background:" + bg + ";padding:14px;margin-bottom:10px;border:2px solid " + bd + ";border-radius:4px;'>" +
               "<h2 style='color:#FFF;margin:4px;'>" + heading + "</h2></div>" +
               "<p style='color:#FFF;white-space:pre-line;font-size:13px;padding:8px;'>" + body + "</p>" +
               "</body></html>";
    }
}
