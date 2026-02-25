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
            "✓ Interactive 20-Question Quiz<br>" +
            "✓ Field Goal Kick Game</p>" +
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
                "2026 Active Roster 🦅",
                "Take a Quiz! 🎯",
                "Field Goal Game 🏈",
                "RB Juke Run 🏃",
                "Falcons Offense 🏟️",
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
            } else if (choice.equals("2026 Active Roster 🦅")) {
                show2026Roster();
            } else if (choice.equals("Take a Quiz! 🎯")) {
                takeQuiz();
            } else if (choice.equals("Field Goal Game 🏈")) {
                playFieldGoalGame();
            } else if (choice.equals("RB Juke Run 🏃")) {
                playRBJukeRun();
            } else if (choice.equals("Falcons Offense 🏟️")) {
                playFalconsOffense();
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
        String current = "<html><body style='width: 550px; background-color: #000000; color: #FFFFFF; font-family: Arial, sans-serif;'>" +
            "<div style='text-align: center; background-color: #A71930; padding: 10px; margin-bottom: 15px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>CURRENT TEAM (2024-2025)</h2>" +
            "</div>" +
            "<table style='width: 100%; color: #FFFFFF; margin-bottom: 15px;'>" +
            "<tr>" +
            "<td style='width: 50%; padding: 10px; background-color: #1a1a1a;'>" +
            "<b style='color: #A71930;'>HEAD COACH</b><br>" +
            "<span style='font-size: 16px;'>Raheem Morris</span>" +
            "</td>" +
            "<td style='width: 50%; padding: 10px; background-color: #1a1a1a;'>" +
            "<b style='color: #A71930;'>GENERAL MANAGER</b><br>" +
            "<span style='font-size: 16px;'>Terry Fontenot</span>" +
            "</td>" +
            "</tr>" +
            "<tr>" +
            "<td style='padding: 10px; background-color: #1a1a1a;'>" +
            "<b style='color: #A71930;'>OWNER</b><br>" +
            "<span style='font-size: 16px;'>Arthur Blank</span>" +
            "</td>" +
            "<td style='padding: 10px; background-color: #1a1a1a;'>" +
            "<b style='color: #A71930;'>MOTTO</b><br>" +
            "<span style='font-size: 16px;'>\"Rise Up!\"</span>" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "<hr style='border: 1px solid #A71930;'>" +
            "<h3 style='color: #A71930; text-align: center; margin: 15px 0;'>KEY PLAYERS</h3>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr>" +
            "<td style='width: 50%; padding: 10px; vertical-align: top; background-color: #1a1a1a;'>" +
            "<h4 style='color: #A71930; margin: 5px 0;'>OFFENSE</h4>" +
            "<ul style='margin: 8px 0; padding-left: 20px;'>" +
            "<li><b>QB:</b> Desmond Ridder/<br>Taylor Heinicke</li>" +
            "<li><b>RB:</b> Bijan Robinson<br><span style='color: #A5ACAF; font-size: 11px;'>(2023 1st round)</span></li>" +
            "<li><b>WR:</b> Drake London</li>" +
            "<li><b>TE:</b> Kyle Pitts</li>" +
            "</ul>" +
            "</td>" +
            "<td style='width: 50%; padding: 10px; vertical-align: top; background-color: #1a1a1a;'>" +
            "<h4 style='color: #A71930; margin: 5px 0;'>DEFENSE</h4>" +
            "<ul style='margin: 8px 0; padding-left: 20px;'>" +
            "<li><b>DT:</b> Grady Jarrett</li>" +
            "<li><b>S:</b> Jessie Bates III</li>" +
            "<li>Multiple young stars</li>" +
            "</ul>" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "<hr style='border: 1px solid #A71930; margin: 15px 0;'>" +
            "<div style='background-color: #1a1a1a; padding: 12px;'>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr>" +
            "<td style='width: 50%;'><b style='color: #A71930;'>Division:</b> NFC South</td>" +
            "<td style='width: 50%;'><b style='color: #A71930;'>Location:</b> Atlanta, GA</td>" +
            "</tr>" +
            "</table>" +
            "<p style='color: #A71930; font-weight: bold; margin: 10px 0 5px 0;'>Division Rivals:</p>" +
            "<p style='color: #FFFFFF; margin: 5px 0;'>• New Orleans Saints<br>• Tampa Bay Buccaneers<br>• Carolina Panthers</p>" +
            "</div>" +
            "<div style='text-align: center; margin-top: 15px; padding: 10px; background-color: #A71930;'>" +
            "<b style='color: #FFFFFF; font-size: 16px;'>RISE UP! 🦅</b>" +
            "</div>" +
            "</body></html>";
        
        JOptionPane.showMessageDialog(null, current,
            "Current Team Info", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void takeQuiz() {
        // Show intro with option to cancel
        int startQuiz = JOptionPane.showConfirmDialog(null,
            "<html><body style='width: 400px; background-color: #000000; color: #FFFFFF; text-align: center;'>" +
            "<div style='background-color: #A71930; padding: 10px; margin-bottom: 10px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>FALCONS QUIZ</h2>" +
            "</div>" +
            "<p style='color: #FFFFFF; font-size: 14px;'>" +
            "Test your knowledge with 10 questions about<br>" +
            "the Atlanta Falcons!</p>" +
            "<p style='color: #A5ACAF; margin-top: 15px;'>Ready to begin?</p>" +
            "<div style='margin-top: 10px; padding: 8px; background-color: #A71930;'>" +
            "<b style='color: #FFFFFF;'>RISE UP! 🦅</b>" +
            "</div>" +
            "</body></html>",
            "Falcons Quiz",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        
        // If user clicks No or closes dialog, return to main menu
        if (startQuiz != JOptionPane.YES_OPTION) {
            return;
        }
        
        int score = 0;
        int totalQuestions = 10;
        
        // Question 1: Team History
        String[] q1Options = {"1965", "1966", "1967", "1970"};
        int q1Answer = JOptionPane.showOptionDialog(null,
            "Question 1: What year was the Atlanta Falcons franchise founded?",
            "Quiz Question 1/10",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            q1Options,
            q1Options[0]);
        if (q1Answer == 1) { // 1966 is correct
            score++;
            JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "✗ Incorrect. The correct answer is 1966.", 
                "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Question 2: Owner
        String[] q2Options = {"Jerry Jones", "Arthur Blank", "Robert Kraft", "Stan Kroenke"};
        int q2Answer = JOptionPane.showOptionDialog(null,
            "Question 2: Who is the current owner of the Atlanta Falcons?",
            "Quiz Question 2/10",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            q2Options,
            q2Options[0]);
        if (q2Answer == 1) { // Arthur Blank is correct
            score++;
            JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "✗ Incorrect. The correct answer is Arthur Blank.", 
                "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Question 3: Stadium
        String[] q3Options = {"Georgia Dome", "Mercedes-Benz Stadium", "Atlanta Stadium", "Turner Field"};
        int q3Answer = JOptionPane.showOptionDialog(null,
            "Question 3: What is the name of the Falcons' current home stadium?",
            "Quiz Question 3/10",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            q3Options,
            q3Options[0]);
        if (q3Answer == 1) { // Mercedes-Benz Stadium is correct
            score++;
            JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "✗ Incorrect. The correct answer is Mercedes-Benz Stadium.", 
                "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Question 4: Super Bowl
        String[] q4Options = {"0", "1", "2", "3"};
        int q4Answer = JOptionPane.showOptionDialog(null,
            "Question 4: How many Super Bowl appearances have the Falcons made?",
            "Quiz Question 4/10",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            q4Options,
            q4Options[0]);
        if (q4Answer == 2) { // 2 is correct
            score++;
            JOptionPane.showMessageDialog(null, "✓ Correct! (1998 and 2016)", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "✗ Incorrect. The correct answer is 2 (1998 and 2016).", 
                "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Question 5: Team Motto
        String[] q5Options = {"Fly High!", "Rise Up!", "Bird Gang!", "In Flight!"};
        int q5Answer = JOptionPane.showOptionDialog(null,
            "Question 5: What is the Atlanta Falcons' team motto?",
            "Quiz Question 5/10",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            q5Options,
            q5Options[0]);
        if (q5Answer == 1) { // Rise Up! is correct
            score++;
            JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "✗ Incorrect. The correct answer is 'Rise Up!'", 
                "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Question 6: Colors
        String[] q6Options = {"Red and Blue", "Red and Black", "Black and Gold", "Red and White"};
        int q6Answer = JOptionPane.showOptionDialog(null,
            "Question 6: What are the primary team colors of the Falcons?",
            "Quiz Question 6/10",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            q6Options,
            q6Options[0]);
        if (q6Answer == 1) { // Red and Black is correct
            score++;
            JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "✗ Incorrect. The correct answer is Red and Black.", 
                "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Question 7: Home Depot Connection
        String[] q7Options = {"The Home Depot", "Lowe's", "Walmart", "Target"};
        int q7Answer = JOptionPane.showOptionDialog(null,
            "Question 7: Arthur Blank was a co-founder of which major retail company?",
            "Quiz Question 7/10",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            q7Options,
            q7Options[0]);
        if (q7Answer == 0) { // The Home Depot is correct
            score++;
            JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "✗ Incorrect. The correct answer is The Home Depot.", 
                "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Question 8: Stadium Opening
        String[] q8Options = {"2015", "2016", "2017", "2018"};
        int q8Answer = JOptionPane.showOptionDialog(null,
            "Question 8: What year did Mercedes-Benz Stadium open?",
            "Quiz Question 8/10",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            q8Options,
            q8Options[0]);
        if (q8Answer == 2) { // 2017 is correct
            score++;
            JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "✗ Incorrect. The correct answer is 2017.", 
                "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Question 9: Division
        String[] q9Options = {"NFC East", "NFC North", "NFC South", "NFC West"};
        int q9Answer = JOptionPane.showOptionDialog(null,
            "Question 9: Which division do the Falcons play in?",
            "Quiz Question 9/10",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            q9Options,
            q9Options[0]);
        if (q9Answer == 2) { // NFC South is correct
            score++;
            JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "✗ Incorrect. The correct answer is NFC South.", 
                "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Question 10: Mascot
        String[] q10Options = {"Freddie Falcon", "Falco", "Talon", "Screech"};
        int q10Answer = JOptionPane.showOptionDialog(null,
            "Question 10: What is the name of the Falcons' mascot?",
            "Quiz Question 10/10",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            q10Options,
            q10Options[0]);
        if (q10Answer == 0) { // Freddie Falcon is correct
            score++;
            JOptionPane.showMessageDialog(null, "✓ Correct!", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "✗ Incorrect. The correct answer is Freddie Falcon.", 
                "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Display final score
        double percentage = (score * 100.0) / totalQuestions;

        String grade;
        String message;
        
        if (percentage >= 90) {
            grade = "A - Outstanding!";
            message = "🏆 Excellent! You're a true Falcons expert!";
        } else if (percentage >= 80) {
            grade = "B - Great Job!";
            message = "👏 Great work! You know your Falcons history!";
        } else if (percentage >= 70) {
            grade = "C - Good Effort!";
            message = "👍 Good job! Keep learning about the Falcons!";
        } else if (percentage >= 60) {
            grade = "D - Keep Studying!";
            message = "📚 Not bad! Review the information and try again!";
        } else {
            grade = "F - Need More Study";
            message = "📖 Keep reading! Explore the other sections to learn more!";
        }
        
        JOptionPane.showMessageDialog(null,
            "════════════════════════════════\n" +
            "QUIZ COMPLETE!\n" +
            "════════════════════════════════\n\n" +
            "Your Score: " + score + " / " + totalQuestions + "\n" +
            "Percentage: " + String.format("%.1f", percentage) + "%\n" +
            "Grade: " + grade + "\n\n" +
            message + "\n\n" +
            "Rise Up! 🦅",
            "Quiz Results",
            JOptionPane.INFORMATION_MESSAGE);
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


    private static void playFieldGoalGame() {
        // ── Distances and base power for each of 5 kicks ──────────────────────
        final String[] DIST_LABELS = {"22-yd (XP)", "35-yd", "47-yd", "55-yd", "63-yd BOMB"};
        final int[]    BASE_POWER  = {1, 2, 3, 4, 5}; // out of 10 — scaled internally

        // ── Show instructions dialog ───────────────────────────────────────────
        javax.swing.JDialog instrDlg = new javax.swing.JDialog((java.awt.Frame) null, "Field Goal Game", true);
        instrDlg.setUndecorated(false);
        instrDlg.setResizable(false);

        javax.swing.JPanel instrPanel = new javax.swing.JPanel(new java.awt.BorderLayout(0, 0));
        instrPanel.setBackground(java.awt.Color.BLACK);

        javax.swing.JLabel titleLbl = new javax.swing.JLabel(
            "<html><div style='text-align:center;color:#FFFFFF;font-size:18px;font-weight:bold;'>🏈 FIELD GOAL GAME 🏈</div>" +
            "<div style='text-align:center;color:#A5ACAF;font-size:12px;'>You are the Falcons kicker!</div></html>",
            javax.swing.SwingConstants.CENTER);
        titleLbl.setBackground(new java.awt.Color(0xA7, 0x19, 0x30));
        titleLbl.setOpaque(true);
        titleLbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(14, 20, 14, 20));

        javax.swing.JLabel instrLbl = new javax.swing.JLabel(
            "<html><div style='width:380px;color:#FFFFFF;font-size:13px;line-height:1.7;padding:14px;'>" +
            "<b style='color:#FFD700;'>CONTROLS:</b><br>" +
            "&nbsp;&nbsp;🎯 <b>← → Arrow Keys</b> — Aim the kick left / right<br>" +
            "&nbsp;&nbsp;💪 <b>↑ ↓ Arrow Keys</b> — Charge up power (hold ↑ to fill bar)<br>" +
            "&nbsp;&nbsp;🦵 <b>SPACE</b> — KICK!<br><br>" +
            "<b style='color:#FFD700;'>WIND:</b><br>" +
            "&nbsp;&nbsp;Each kick has random wind. A crosswind pushes the ball sideways.<br>" +
            "&nbsp;&nbsp;A headwind reduces distance; a tailwind boosts it.<br>" +
            "&nbsp;&nbsp;Read the wind indicator and adjust your aim + power!<br><br>" +
            "<b style='color:#A71930;'>Attempt 5 field goals to complete the game.</b>" +
            "</div></html>",
            javax.swing.SwingConstants.LEFT);
        instrLbl.setBackground(java.awt.Color.BLACK);
        instrLbl.setOpaque(true);

        javax.swing.JButton startBtn = new javax.swing.JButton("▶  LET'S KICK!");
        startBtn.setBackground(new java.awt.Color(0xA7, 0x19, 0x30));
        startBtn.setForeground(java.awt.Color.WHITE);
        startBtn.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
        startBtn.setFocusPainted(false);
        startBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 30, 10, 30));
        startBtn.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.JButton cancelBtn = new javax.swing.JButton("Cancel");
        cancelBtn.setBackground(new java.awt.Color(0x33, 0x33, 0x33));
        cancelBtn.setForeground(java.awt.Color.LIGHT_GRAY);
        cancelBtn.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
        cancelBtn.setFocusPainted(false);
        cancelBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 20, 8, 20));

        boolean[] shouldPlay = {false};
        startBtn.addActionListener(e -> { shouldPlay[0] = true; instrDlg.dispose(); });
        cancelBtn.addActionListener(e -> instrDlg.dispose());

        javax.swing.JPanel btnRow = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 12, 10));
        btnRow.setBackground(java.awt.Color.BLACK);
        btnRow.add(startBtn);
        btnRow.add(cancelBtn);

        instrPanel.add(titleLbl, java.awt.BorderLayout.NORTH);
        instrPanel.add(instrLbl, java.awt.BorderLayout.CENTER);
        instrPanel.add(btnRow,   java.awt.BorderLayout.SOUTH);

        instrDlg.setContentPane(instrPanel);
        instrDlg.pack();
        instrDlg.setLocationRelativeTo(null);
        instrDlg.setVisible(true);

        if (!shouldPlay[0]) return;

        // ── Main game frame ────────────────────────────────────────────────────
        javax.swing.JFrame gf = new javax.swing.JFrame("🏈 Falcons Field Goal Game");
        gf.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        gf.setResizable(false);

        final int W = 700, H = 520;

        // ── Game state ─────────────────────────────────────────────────────────
        final int   TOTAL_KICKS    = 5;
        final int[] madeArr        = {0};
        final int[] kickNum        = {0};     // 0-based current kick

        // Ball physics state
        final double[] ballX  = {W / 2.0};
        final double[] ballY  = {H - 80.0};
        final double[] velX   = {0};
        final double[] velY   = {0};
        final double[] ballZ  = {0};   // z = depth (0=ground, grows as ball goes up-range)
        final double[] velZ   = {0};

        // Aiming
        final double[] aimAngle = {0.0};   // radians from center, left<0 right>0
        final double[] power    = {0.0};   // 0.0 – 1.0

        // Wind per kick (regenerated each kick)
        final double[] windX = {0};  // crosswind m/s equivalent pixels/frame²
        final double[] windZ = {0};  // headwind (negative) / tailwind (positive)

        // State machine
        // 0=aiming, 1=charging, 2=in_flight, 3=result_pause, 4=game_over
        final int[] state = {0};
        final boolean[] kicked = {false};
        final String[] resultMsg   = {""};
        final boolean[] resultGood = {false};
        final int[] resultTimer    = {0};

        // Keys held
        final boolean[] leftHeld  = {false};
        final boolean[] rightHeld = {false};
        final boolean[] upHeld    = {false};
        final boolean[] downHeld  = {false};

        java.util.Random rng = new java.util.Random();

        // Helper: init new kick
        Runnable initKick = () -> {
            ballX[0] = W / 2.0;
            ballY[0] = H - 80.0;
            velX[0]  = 0; velY[0] = 0;
            ballZ[0] = 0; velZ[0] = 0;
            aimAngle[0] = 0.0;
            power[0]    = 0.0;
            kicked[0]   = false;
            state[0]    = 0;

            // Random wind: crosswind -3..+3, headwind -2..+2
            windX[0] = (rng.nextDouble() * 6.0 - 3.0);  // pixels drift per frame while in air
            windZ[0] = (rng.nextDouble() * 4.0 - 2.0);  // power modifier
        };
        initKick.run();

        // ── Canvas ─────────────────────────────────────────────────────────────
        javax.swing.JPanel canvas = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g0) {
                super.paintComponent(g0);
                java.awt.Graphics2D g = (java.awt.Graphics2D) g0;
                g.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                   java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

                // ── Background: sky gradient ───────────────────────────────────
                java.awt.GradientPaint sky = new java.awt.GradientPaint(
                    0, 0, new java.awt.Color(0x0A, 0x0A, 0x25),
                    0, H - 120, new java.awt.Color(0x1A, 0x1A, 0x3A));
                g.setPaint(sky);
                g.fillRect(0, 0, W, H - 120);

                // ── Field ──────────────────────────────────────────────────────
                g.setColor(new java.awt.Color(0x22, 0x6B, 0x22));
                g.fillRect(0, H - 120, W, 120);
                // yard lines
                g.setColor(new java.awt.Color(0xFF, 0xFF, 0xFF, 60));
                for (int lx = 50; lx < W; lx += 80) {
                    g.fillRect(lx, H - 120, 2, 120);
                }
                // enzone tint behind uprights
                g.setColor(new java.awt.Color(0xA7, 0x19, 0x30, 40));
                g.fillRect(W/2 - 80, H - 120, 160, 60);

                // ── Uprights ───────────────────────────────────────────────────
                int upW = 100, upH = 180;
                int upX = W / 2 - upW / 2;
                int upY = H - 120 - upH;
                g.setColor(new java.awt.Color(0xFF, 0xD7, 0x00));
                g.setStroke(new java.awt.BasicStroke(5, java.awt.BasicStroke.CAP_ROUND, java.awt.BasicStroke.JOIN_ROUND));
                // post
                g.drawLine(W / 2, H - 120, W / 2, upY + 60);
                // crossbar
                g.drawLine(upX, upY + 60, upX + upW, upY + 60);
                // left upright
                g.drawLine(upX, upY + 60, upX, upY);
                // right upright
                g.drawLine(upX + upW, upY + 60, upX + upW, upY);

                // ── Wind indicator ─────────────────────────────────────────────
                int windPanelX = 10, windPanelY = 10, windPanelW = 190, windPanelH = 64;
                g.setColor(new java.awt.Color(0, 0, 0, 170));
                g.fillRoundRect(windPanelX, windPanelY, windPanelW, windPanelH, 10, 10);
                g.setColor(new java.awt.Color(0xA7, 0x19, 0x30));
                g.setStroke(new java.awt.BasicStroke(1.5f));
                g.drawRoundRect(windPanelX, windPanelY, windPanelW, windPanelH, 10, 10);

                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
                g.setColor(new java.awt.Color(0xFF, 0xD7, 0x00));
                g.drawString("💨 WIND", windPanelX + 8, windPanelY + 16);

                // Crosswind bar
                g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 10));
                g.setColor(java.awt.Color.WHITE);
                g.drawString("Cross:", windPanelX + 8, windPanelY + 32);
                int barW = 110, barH = 8;
                int barX = windPanelX + 55, barY = windPanelY + 24;
                g.setColor(new java.awt.Color(0x44, 0x44, 0x44));
                g.fillRoundRect(barX, barY, barW, barH, 4, 4);
                // wind fill: center=neutral, left=negative, right=positive
                double cwNorm = (windX[0] + 3.0) / 6.0; // 0..1
                int fillX   = (int)(barX + barW/2.0);
                int fillW2  = (int)((cwNorm - 0.5) * barW);
                java.awt.Color cwColor = Math.abs(windX[0]) < 0.5
                    ? new java.awt.Color(0x66, 0xFF, 0x88)
                    : new java.awt.Color(0xFF, 0x88, 0x22);
                g.setColor(cwColor);
                if (fillW2 >= 0)
                    g.fillRoundRect(fillX, barY, fillW2, barH, 4, 4);
                else
                    g.fillRoundRect(fillX + fillW2, barY, -fillW2, barH, 4, 4);
                // center tick
                g.setColor(java.awt.Color.WHITE);
                g.fillRect(barX + barW/2, barY - 1, 2, barH + 2);

                String cwLabel = windX[0] > 0.5 ? "→ Right" : windX[0] < -0.5 ? "← Left" : "Calm";
                g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 9));
                g.setColor(cwColor);
                g.drawString(cwLabel, barX + barW + 4, barY + 8);

                // Headwind/tailwind
                g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 10));
                g.setColor(java.awt.Color.WHITE);
                g.drawString("Depth:", windPanelX + 8, windPanelY + 52);
                String hwLabel;
                java.awt.Color hwColor;
                if      (windZ[0] >  1.0) { hwLabel = "↑ Tailwind (strong)"; hwColor = new java.awt.Color(0x00, 0xCC, 0x44); }
                else if (windZ[0] >  0.1) { hwLabel = "↑ Tailwind";          hwColor = new java.awt.Color(0x66, 0xFF, 0x88); }
                else if (windZ[0] < -1.0) { hwLabel = "↓ Headwind (strong)"; hwColor = new java.awt.Color(0xFF, 0x44, 0x44); }
                else if (windZ[0] < -0.1) { hwLabel = "↓ Headwind";          hwColor = new java.awt.Color(0xFF, 0xAA, 0x44); }
                else                      { hwLabel = "Calm";                 hwColor = new java.awt.Color(0xA5, 0xAC, 0xAF); }
                g.setColor(hwColor);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 10));
                g.drawString(hwLabel, windPanelX + 55, windPanelY + 52);

                // ── HUD top-right: kick counter ────────────────────────────────
                g.setColor(new java.awt.Color(0, 0, 0, 170));
                g.fillRoundRect(W - 160, 10, 150, 50, 10, 10);
                g.setColor(new java.awt.Color(0xA7, 0x19, 0x30));
                g.setStroke(new java.awt.BasicStroke(1.5f));
                g.drawRoundRect(W - 160, 10, 150, 50, 10, 10);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
                g.setColor(java.awt.Color.WHITE);
                g.drawString("Kick " + (kickNum[0] + 1) + " of " + TOTAL_KICKS, W - 148, 32);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 11));
                g.setColor(new java.awt.Color(0xFF, 0xD7, 0x00));
                g.drawString("Made: " + madeArr[0] + "  |  " + DIST_LABELS[Math.min(kickNum[0], TOTAL_KICKS-1)], W - 148, 50);

                // ── Aim arrow from ball ────────────────────────────────────────
                if (state[0] == 0 || state[0] == 1) {
                    double ax = ballX[0] + Math.sin(aimAngle[0]) * 55;
                    double ay = ballY[0] - Math.cos(aimAngle[0]) * 55;
                    g.setColor(new java.awt.Color(0xFF, 0xD7, 0x00, 200));
                    g.setStroke(new java.awt.BasicStroke(2.5f, java.awt.BasicStroke.CAP_ROUND, java.awt.BasicStroke.JOIN_ROUND));
                    g.drawLine((int)ballX[0], (int)ballY[0], (int)ax, (int)ay);
                    // arrowhead
                    double dx = ax - ballX[0], dy = ay - ballY[0];
                    double len = Math.sqrt(dx*dx+dy*dy);
                    dx/=len; dy/=len;
                    int[] px = {(int)ax, (int)(ax - dx*10 + dy*5), (int)(ax - dx*10 - dy*5)};
                    int[] py = {(int)ay, (int)(ay - dy*10 - dx*5), (int)(ay - dy*10 + dx*5)};
                    g.fillPolygon(px, py, 3);
                }

                // ── Power bar ──────────────────────────────────────────────────
                int pbX = W - 28, pbY = H - 300, pbW = 18, pbH = 200;
                g.setColor(new java.awt.Color(0, 0, 0, 160));
                g.fillRoundRect(pbX - 2, pbY - 2, pbW + 4, pbH + 4, 6, 6);
                g.setColor(new java.awt.Color(0x33, 0x33, 0x33));
                g.fillRoundRect(pbX, pbY, pbW, pbH, 4, 4);
                int fillH = (int)(power[0] * pbH);
                java.awt.Color barColor = power[0] < 0.5
                    ? new java.awt.Color(0x22, 0xCC, 0x44)
                    : power[0] < 0.85
                        ? new java.awt.Color(0xFF, 0xCC, 0x00)
                        : new java.awt.Color(0xFF, 0x33, 0x33);
                g.setColor(barColor);
                g.fillRoundRect(pbX, pbY + pbH - fillH, pbW, fillH, 4, 4);
                // label
                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 9));
                g.setColor(java.awt.Color.WHITE);
                g.drawString("PWR", pbX, pbY - 4);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 9));
                g.drawString("↑↓", pbX + 2, pbY + pbH + 12);

                // ── Ball ──────────────────────────────────────────────────────
                // Scale: as ballZ grows (ball going upfield), draw ball higher and smaller
                double perspective = Math.min(1.0, ballZ[0] / 400.0);
                int ballRadius = Math.max(4, (int)(12 * (1.0 - perspective * 0.6)));
                int drawBX = (int)ballX[0];
                int drawBY = (int)(ballY[0] - ballZ[0] * 0.55); // perspective lift

                // shadow on field
                if (drawBY < H - 80) {
                    g.setColor(new java.awt.Color(0, 0, 0, 80));
                    g.fillOval(drawBX - ballRadius, H - 100, ballRadius * 2, 6);
                }

                g.setColor(new java.awt.Color(0xC4, 0x7C, 0x25));
                g.fillOval(drawBX - ballRadius, drawBY - ballRadius, ballRadius * 2, ballRadius * 2);
                g.setColor(new java.awt.Color(0xFF, 0xFF, 0xFF, 160));
                g.setStroke(new java.awt.BasicStroke(1.0f));
                g.drawOval(drawBX - ballRadius + 1, drawBY - ballRadius + 1, ballRadius * 2 - 2, ballRadius * 2 - 2);

                // ── Controls hint at bottom ────────────────────────────────────
                g.setColor(new java.awt.Color(0, 0, 0, 180));
                g.fillRect(0, H - 28, W, 28);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 11));
                g.setColor(new java.awt.Color(0xA5, 0xAC, 0xAF));
                if (state[0] == 0)
                    g.drawString("← → Aim   |   ↑ ↓ Charge Power   |   SPACE = Kick!", 20, H - 10);
                else if (state[0] == 1)
                    g.drawString("Hold ↑ to charge power, ↓ to reduce   |   SPACE = Kick!", 20, H - 10);
                else if (state[0] == 2)
                    g.drawString("Ball in flight... 🏈", 20, H - 10);
                else if (state[0] == 3) {
                    g.setColor(resultGood[0] ? new java.awt.Color(0x00, 0xCC, 0x44) : new java.awt.Color(0xFF, 0x44, 0x44));
                    g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 13));
                    g.drawString(resultMsg[0] + "   (SPACE to continue)", 20, H - 10);
                }

                // ── "Aiming" label under arrow ─────────────────────────────────
                if (state[0] == 0) {
                    g.setFont(new java.awt.Font("Arial", java.awt.Font.ITALIC, 11));
                    g.setColor(new java.awt.Color(0xFF, 0xD7, 0x00, 180));
                    g.drawString("AIMING", (int)ballX[0] - 22, (int)ballY[0] + 18);
                } else if (state[0] == 1) {
                    g.setFont(new java.awt.Font("Arial", java.awt.Font.ITALIC, 11));
                    g.setColor(barColor);
                    g.drawString("CHARGING", (int)ballX[0] - 28, (int)ballY[0] + 18);
                }
            }
        };
        canvas.setPreferredSize(new java.awt.Dimension(W, H));
        canvas.setBackground(java.awt.Color.BLACK);
        canvas.setFocusable(true);

        // ── Key bindings ───────────────────────────────────────────────────────
        canvas.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override public void keyPressed(java.awt.event.KeyEvent e) {
                switch (e.getKeyCode()) {
                    case java.awt.event.KeyEvent.VK_LEFT:  leftHeld[0]  = true; break;
                    case java.awt.event.KeyEvent.VK_RIGHT: rightHeld[0] = true; break;
                    case java.awt.event.KeyEvent.VK_UP:    upHeld[0]    = true; break;
                    case java.awt.event.KeyEvent.VK_DOWN:  downHeld[0]  = true; break;
                    case java.awt.event.KeyEvent.VK_SPACE:
                        if (state[0] == 0 || state[0] == 1) {
                            // KICK!
                            if (!kicked[0] && power[0] > 0.02) {
                                kicked[0] = true;
                                state[0]  = 2;
                                // Compute velocity from aim and power
                                // base speed proportional to power; wind modifies Z
                                double kickSpeed = 8.0 + power[0] * 14.0 + windZ[0] * 0.8;
                                velX[0] = Math.sin(aimAngle[0]) * kickSpeed;
                                velZ[0] = kickSpeed * 1.4; // forward velocity
                                velY[0] = -(kickSpeed * 0.5); // upward
                            }
                        } else if (state[0] == 3) {
                            // Advance to next kick or game over
                            kickNum[0]++;
                            if (kickNum[0] >= TOTAL_KICKS) {
                                state[0] = 4;
                            } else {
                                initKick.run();
                            }
                        }
                        break;
                }
            }
            @Override public void keyReleased(java.awt.event.KeyEvent e) {
                switch (e.getKeyCode()) {
                    case java.awt.event.KeyEvent.VK_LEFT:  leftHeld[0]  = false; break;
                    case java.awt.event.KeyEvent.VK_RIGHT: rightHeld[0] = false; break;
                    case java.awt.event.KeyEvent.VK_UP:    upHeld[0]    = false; break;
                    case java.awt.event.KeyEvent.VK_DOWN:  downHeld[0]  = false; break;
                }
            }
        });

        gf.setContentPane(canvas);
        gf.pack();
        gf.setLocationRelativeTo(null);
        gf.setVisible(true);
        canvas.requestFocusInWindow();

        // ── Game loop ──────────────────────────────────────────────────────────
        final int TARGET_FPS = 60;
        final long FRAME_MS  = 1000 / TARGET_FPS;

        // Uprights geometry (must match paint)
        final int upW = 100, upH = 180;
        final int upX = W / 2 - upW / 2;
        final int crossbarY = (H - 120) - upH + 60; // screen Y of crossbar

        while (gf.isVisible() && state[0] != 4) {
            long t0 = System.currentTimeMillis();

            if (state[0] == 0) {
                // Aiming phase
                if (leftHeld[0])  aimAngle[0] = Math.max(-0.45, aimAngle[0] - 0.025);
                if (rightHeld[0]) aimAngle[0] = Math.min( 0.45, aimAngle[0] + 0.025);
                if (upHeld[0] || downHeld[0]) state[0] = 1; // switch to charging
            } else if (state[0] == 1) {
                // Charging phase — can still aim
                if (leftHeld[0])  aimAngle[0] = Math.max(-0.45, aimAngle[0] - 0.015);
                if (rightHeld[0]) aimAngle[0] = Math.min( 0.45, aimAngle[0] + 0.015);
                if (upHeld[0])   power[0] = Math.min(1.0, power[0] + 0.018);
                if (downHeld[0]) power[0] = Math.max(0.0, power[0] - 0.018);
            } else if (state[0] == 2) {
                // Flight phase
                // Apply crosswind drift
                velX[0] += windX[0] * 0.012;
                // Gravity on Y (visual up component)
                velY[0] += 0.22;
                // Update positions
                ballX[0] += velX[0];
                ballY[0] += velY[0];
                ballZ[0] += velZ[0];
                velZ[0]  *= 0.985; // air resistance

                // Perspective screen Y: lift ball as Z increases
                double drawBY = ballY[0] - ballZ[0] * 0.55;

                // Check if ball has gone far enough (Z) to reach upright plane
                // The uprights are drawn at H-120-upH in screen space ≈ Z ~350
                boolean reachedUprights = ballZ[0] > 300;

                // Also detect if ball hits ground visually
                boolean hitGround = drawBY > H - 90 && ballZ[0] > 50;

                if (reachedUprights) {
                    // Did it pass between uprights and above crossbar?
                    boolean withinX = ballX[0] > upX + 6 && ballX[0] < upX + upW - 6;
                    double perspY   = ballY[0] - ballZ[0] * 0.55;
                    boolean aboveCrossbar = perspY < crossbarY;

                    if (withinX && aboveCrossbar) {
                        resultMsg[0]  = "✅  IT'S GOOD!  RISE UP! 🦅";
                        resultGood[0] = true;
                        madeArr[0]++;
                    } else if (!withinX) {
                        double missDir = ballX[0] <= upX + 6 ? -1 : 1;
                        resultMsg[0]  = missDir < 0 ? "❌  NO GOOD — Wide Left!" : "❌  NO GOOD — Wide Right!";
                        resultGood[0] = false;
                    } else {
                        resultMsg[0]  = "❌  NO GOOD — Under the Bar!";
                        resultGood[0] = false;
                    }
                    state[0] = 3;
                    resultTimer[0] = 0;
                } else if (hitGround) {
                    resultMsg[0]  = "❌  NO GOOD — Ball Fell Short!";
                    resultGood[0] = false;
                    state[0] = 3;
                    resultTimer[0] = 0;
                }
            } else if (state[0] == 3) {
                resultTimer[0]++;
            }

            canvas.repaint();

            long elapsed = System.currentTimeMillis() - t0;
            long sleep   = FRAME_MS - elapsed;
            if (sleep > 0) {
                try { Thread.sleep(sleep); } catch (InterruptedException ignored) {}
            }
        }

        gf.dispose();

        // ── Final results dialog ───────────────────────────────────────────────
        if (state[0] == 4 || !gf.isVisible()) {
            int made = madeArr[0];
            String rating, ratingColor;
            if      (made == 5) { rating = "🏆 PERFECT! You're a Pro Bowler!";      ratingColor = "#FFD700"; }
            else if (made >= 4) { rating = "⭐ Excellent! Starting caliber!";        ratingColor = "#A71930"; }
            else if (made >= 3) { rating = "👍 Solid! You made the roster!";         ratingColor = "#A71930"; }
            else if (made >= 2) { rating = "😬 Needs work — Practice squad for you!";ratingColor = "#A5ACAF"; }
            else                { rating = "😅 You're cut! Back to tryouts!";         ratingColor = "#A5ACAF"; }

            JOptionPane.showMessageDialog(null,
                "<html><body style='width:340px;background-color:#000000;color:#FFFFFF;text-align:center;font-family:Arial,sans-serif;'>" +
                "<div style='background-color:#A71930;padding:15px;margin-bottom:15px;'>" +
                "<h2 style='color:#FFFFFF;margin:5px;'>🏈 FINAL RESULTS 🏈</h2>" +
                "</div>" +
                "<p style='font-size:32px;font-weight:bold;color:#FFFFFF;margin:15px;'>" + made + " / 5 Made</p>" +
                "<p style='font-size:15px;color:" + ratingColor + ";font-weight:bold;margin:10px;'>" + rating + "</p>" +
                "<div style='margin-top:15px;padding:10px;background-color:#A71930;'>" +
                "<b style='color:#FFFFFF;'>RISE UP! 🦅</b>" +
                "</div>" +
                "</body></html>",
                "Field Goal Game — Results", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    // ═══════════════════════════════════════════════════════════════════════════
    //  RB JUKE RUN — Offense only, RBs only
    // ═══════════════════════════════════════════════════════════════════════════
    private static void playRBJukeRun() {

        // ── RB roster ─────────────────────────────────────────────────────────
        String[] rbNames   = {"Bijan Robinson #7", "Tyler Allgeier #25", "Nate Carter #38"};
        String[] rbDescs   = {"Elite vision & burst — top-10 RB in NFL", "Powerful runner, north-south style", "Rookie speedster — raw but fast"};
        double[] rbSpeeds  = {4.2, 3.9, 4.5};   // base move speed
        double[] rbJukes   = {1.0, 0.7, 0.85};  // juke effectiveness multiplier

        // ── Intro / player select ─────────────────────────────────────────────
        int pick = JOptionPane.showOptionDialog(null,
            "<html><body style='width:420px;background:#000;color:#fff;text-align:center;font-family:Arial,sans-serif;'>" +
            "<div style='background:#A71930;padding:14px;margin-bottom:12px;'>" +
            "<h2 style='color:#fff;margin:4px;'>🏃 RB JUKE RUN 🏃</h2>" +
            "<p style='color:#fff;margin:4px;font-size:12px;'>Falcons Running Back Challenge</p></div>" +
            "<p style='color:#fff;font-size:13px;margin:10px;'>Break tackles, juke defenders, reach the end zone!<br>" +
            "You have <b style='color:#FFD700;'>3 downs</b> — score as many TDs as you can!</p>" +
            "<div style='background:#1a1a1a;padding:10px;border:2px solid #A71930;margin:8px 0;text-align:left;'>" +
            "<p style='color:#FFD700;font-weight:bold;margin:4px;'>CONTROLS:</p>" +
            "<p style='color:#A5ACAF;font-size:12px;margin:4px;'>" +
            "⬆️⬇️⬅️➡️ <b>Arrow Keys</b> — Run<br>" +
            "🕹️ <b>SPACE</b> — JUKE! (brief speed burst + direction shift)</p></div>" +
            "<p style='color:#A5ACAF;font-size:12px;margin:8px;'>Choose your running back:</p>" +
            "</body></html>",
            "RB Juke Run — Pick Your RB",
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, rbNames, rbNames[0]);

        if (pick < 0) return;

        String chosenName  = rbNames[pick];
        double chosenSpeed = rbSpeeds[pick];
        double chosenJuke  = rbJukes[pick];

        // ── Game frame ────────────────────────────────────────────────────────
        final int W = 720, H = 560;
        final int FIELD_TOP    = 65;
        final int FIELD_BOTTOM = H - 45;
        final int EZ_HEIGHT    = 65;

        final java.awt.Color RED    = new java.awt.Color(0xA7, 0x19, 0x30);
        final java.awt.Color GOLD   = new java.awt.Color(0xFF, 0xD7, 0x00);
        final java.awt.Color GRASS1 = new java.awt.Color(0x2E, 0x7D, 0x32);
        final java.awt.Color GRASS2 = new java.awt.Color(0x38, 0x8E, 0x3C);
        final java.awt.Color BLACK  = new java.awt.Color(0x10, 0x10, 0x10);
        final java.awt.Color SILVER = new java.awt.Color(0xA5, 0xAC, 0xAF);

        // ── State ─────────────────────────────────────────────────────────────
        final int   MAX_DOWNS   = 3;
        final int   NUM_DEF     = 4;   // 4 defenders
        final int[] downs       = {0};
        final int[] touchdowns  = {0};
        final int[] totalScore  = {0};

        // Player
        final double[] px = {W / 2.0};
        final double[] py = {FIELD_BOTTOM - 35.0};
        final double[] jukeVX = {0};   // juke horizontal boost
        final double[] jukeVY = {0};   // juke vertical boost
        final int[]    jukeTimer = {0};
        final boolean[] juking   = {false};

        // Defenders
        final double[] dx2 = new double[NUM_DEF];
        final double[] dy2 = new double[NUM_DEF];

        java.util.Random rng = new java.util.Random();

        Runnable resetDown = () -> {
            px[0] = W / 2.0 + (rng.nextDouble() - 0.5) * 80;
            py[0] = FIELD_BOTTOM - 35.0;
            juking[0]    = false;
            jukeTimer[0] = 0;
            jukeVX[0]    = 0;
            jukeVY[0]    = 0;

            // Spread defenders across upper field, different rows
            double diffMult = 1.0 + downs[0] * 0.2;
            for (int i = 0; i < NUM_DEF; i++) {
                dx2[i] = 80 + (i * ((W - 160.0) / (NUM_DEF - 1)));
                dy2[i] = FIELD_TOP + EZ_HEIGHT + 40 + (i % 2) * 80 + rng.nextInt(50);
            }
        };
        resetDown.run();

        // Keys
        final boolean[] kL = {false}, kR = {false}, kU = {false}, kD = {false}, kSp = {false};
        final boolean[] spWas = {false};

        // Game state: 0=running, 1=td_pause, 2=tackle_pause, 3=gameover
        final int[]     gState     = {0};
        final int[]     pauseTimer = {0};
        final String[]  pauseMsg   = {""};
        final boolean[] pauseGood  = {false};

        javax.swing.JFrame gf = new javax.swing.JFrame("🏃 RB Juke Run — " + chosenName);
        gf.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        gf.setResizable(false);

        // Yard markers (static, computed once)
        final int[] yardY = new int[5];
        for (int i = 0; i < 5; i++)
            yardY[i] = FIELD_TOP + EZ_HEIGHT + (int)((i + 1) * (FIELD_BOTTOM - FIELD_TOP - EZ_HEIGHT) / 6.0);

        javax.swing.JPanel canvas = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g0) {
                super.paintComponent(g0);
                java.awt.Graphics2D g = (java.awt.Graphics2D) g0;
                g.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                   java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

                // ── Grass stripes ──────────────────────────────────────────
                int stripeH = 55;
                for (int sy = FIELD_TOP + EZ_HEIGHT; sy < FIELD_BOTTOM; sy += stripeH) {
                    int row = (sy - FIELD_TOP - EZ_HEIGHT) / stripeH;
                    g.setColor(row % 2 == 0 ? GRASS1 : GRASS2);
                    g.fillRect(0, sy, W, Math.min(stripeH, FIELD_BOTTOM - sy));
                }

                // ── End zone ───────────────────────────────────────────────
                g.setColor(RED);
                g.fillRect(0, FIELD_TOP, W, EZ_HEIGHT);
                g.setColor(java.awt.Color.WHITE);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
                java.awt.FontMetrics fm = g.getFontMetrics();
                String ezTxt = "FALCONS END ZONE 🦅";
                g.drawString(ezTxt, (W - fm.stringWidth(ezTxt)) / 2, FIELD_TOP + 40);

                // ── Crowd / sky above ──────────────────────────────────────
                g.setColor(new java.awt.Color(0x10, 0x10, 0x30));
                g.fillRect(0, 0, W, FIELD_TOP);
                java.util.Random dotRng = new java.util.Random(7);
                for (int d = 0; d < 140; d++) {
                    g.setColor(new java.awt.Color(
                        140 + dotRng.nextInt(115), dotRng.nextInt(40), dotRng.nextInt(40), 180));
                    g.fillOval(dotRng.nextInt(W), dotRng.nextInt(FIELD_TOP - 2) + 1, 5, 5);
                }

                // ── Yard lines & hash marks ────────────────────────────────
                g.setColor(new java.awt.Color(255, 255, 255, 90));
                g.setStroke(new java.awt.BasicStroke(1.5f));
                for (int yy : yardY) {
                    g.drawLine(0, yy, W, yy);
                }
                g.setColor(new java.awt.Color(255, 255, 255, 60));
                g.setStroke(new java.awt.BasicStroke(1f));
                int hcx = W / 2;
                for (int sy = FIELD_TOP + EZ_HEIGHT + 20; sy < FIELD_BOTTOM; sy += 28) {
                    g.drawLine(hcx - 18, sy, hcx - 5, sy);
                    g.drawLine(hcx + 5,  sy, hcx + 18, sy);
                }

                // ── Bottom / sideline areas ────────────────────────────────
                g.setColor(BLACK);
                g.fillRect(0, FIELD_BOTTOM, W, H - FIELD_BOTTOM);
                g.setColor(RED);
                g.setStroke(new java.awt.BasicStroke(3f));
                g.drawRect(1, FIELD_TOP + EZ_HEIGHT, W - 2, FIELD_BOTTOM - FIELD_TOP - EZ_HEIGHT - 1);

                // ── HUD ────────────────────────────────────────────────────
                g.setColor(BLACK);
                g.fillRect(0, H - 45, W, 45);
                g.setColor(RED);
                g.fillRect(0, H - 45, W, 3);

                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 13));
                g.setColor(java.awt.Color.WHITE);
                g.drawString("Down: " + (downs[0] + 1) + " / " + MAX_DOWNS, 12, H - 25);
                g.drawString("TDs: " + touchdowns[0] + "  |  Score: " + totalScore[0], 12, H - 8);

                g.setColor(SILVER);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 11));
                String shortN = chosenName.contains("#") ? chosenName.substring(0, chosenName.indexOf("#")).trim() : chosenName;
                g.drawString("🏃 " + shortN, 220, H - 18);

                g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 10));
                g.setColor(new java.awt.Color(0xA5, 0xAC, 0xAF));
                g.drawString("Arrow Keys = Run   |   SPACE = JUKE!", 360, H - 8);

                // ── Juke meter ─────────────────────────────────────────────
                // Show a small juke cooldown bar bottom-right
                int jBarX = W - 110, jBarY = H - 38, jBarW = 100, jBarH = 10;
                g.setColor(new java.awt.Color(0x33, 0x33, 0x33));
                g.fillRoundRect(jBarX, jBarY, jBarW, jBarH, 4, 4);
                double jukeCool = juking[0] ? 1.0 - (jukeTimer[0] / 30.0) : 1.0;
                g.setColor(juking[0] ? GOLD : new java.awt.Color(0x00, 0xCC, 0x44));
                g.fillRoundRect(jBarX, jBarY, (int)(jBarW * jukeCool), jBarH, 4, 4);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 9));
                g.setColor(java.awt.Color.WHITE);
                g.drawString(juking[0] ? "JUKING!" : "JUKE READY", jBarX, jBarY - 2);

                // ── Defenders ─────────────────────────────────────────────
                for (int i = 0; i < NUM_DEF; i++) {
                    drawRBPlayer(g, (int)dx2[i], (int)dy2[i],
                        new java.awt.Color(0x1A, 0x37, 0x7C), java.awt.Color.WHITE,
                        i == 0 ? "CB" : i == 1 ? "LB" : i == 2 ? "S" : "DE", false);
                }

                // ── Player (RB) ────────────────────────────────────────────
                drawRBPlayer(g, (int)px[0], (int)py[0], RED, java.awt.Color.WHITE, "RB", true);

                // Juke glow
                if (juking[0]) {
                    g.setColor(new java.awt.Color(0xFF, 0xD7, 0x00, 70));
                    g.fillOval((int)px[0] - 24, (int)py[0] - 24, 48, 48);
                    g.setColor(new java.awt.Color(0xFF, 0xFF, 0xFF, 40));
                    g.fillOval((int)px[0] - 18, (int)py[0] - 18, 36, 36);
                }

                // ── Pause overlay ──────────────────────────────────────────
                if (gState[0] >= 1) {
                    g.setColor(new java.awt.Color(0, 0, 0, 175));
                    g.fillRect(0, H/2 - 60, W, 120);
                    g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 28));
                    g.setColor(pauseGood[0] ? new java.awt.Color(0x00, 0xCC, 0x44) : new java.awt.Color(0xFF, 0x33, 0x33));
                    fm = g.getFontMetrics();
                    g.drawString(pauseMsg[0], (W - fm.stringWidth(pauseMsg[0])) / 2, H/2 - 12);
                    g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
                    g.setColor(java.awt.Color.WHITE);
                    String sub = gState[0] == 3 ? "SPACE to see results" : "SPACE to run next down...";
                    fm = g.getFontMetrics();
                    g.drawString(sub, (W - fm.stringWidth(sub)) / 2, H/2 + 22);
                }
            }
        };
        canvas.setPreferredSize(new java.awt.Dimension(W, H));
        canvas.setBackground(GRASS1);
        canvas.setFocusable(true);

        canvas.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override public void keyPressed(java.awt.event.KeyEvent e) {
                switch (e.getKeyCode()) {
                    case java.awt.event.KeyEvent.VK_LEFT:  kL[0]  = true; break;
                    case java.awt.event.KeyEvent.VK_RIGHT: kR[0]  = true; break;
                    case java.awt.event.KeyEvent.VK_UP:    kU[0]  = true; break;
                    case java.awt.event.KeyEvent.VK_DOWN:  kD[0]  = true; break;
                    case java.awt.event.KeyEvent.VK_SPACE: kSp[0] = true; break;
                }
            }
            @Override public void keyReleased(java.awt.event.KeyEvent e) {
                switch (e.getKeyCode()) {
                    case java.awt.event.KeyEvent.VK_LEFT:  kL[0]  = false; break;
                    case java.awt.event.KeyEvent.VK_RIGHT: kR[0]  = false; break;
                    case java.awt.event.KeyEvent.VK_UP:    kU[0]  = false; break;
                    case java.awt.event.KeyEvent.VK_DOWN:  kD[0]  = false; break;
                    case java.awt.event.KeyEvent.VK_SPACE: kSp[0] = false; break;
                }
            }
        });

        gf.setContentPane(canvas);
        gf.pack();
        gf.setLocationRelativeTo(null);
        gf.setVisible(true);
        canvas.requestFocusInWindow();

        final int PLAYER_R = 14, DEF_R = 14;
        final long FRAME_MS = 1000 / 60;
        int frameCount = 0;

        // ── Game loop ──────────────────────────────────────────────────────────
        while (gf.isVisible()) {
            long t0 = System.currentTimeMillis();
            frameCount++;

            boolean spEdge = kSp[0] && !spWas[0];
            spWas[0] = kSp[0];

            // ── Pause states ───────────────────────────────────────────────
            if (gState[0] == 1 || gState[0] == 2) {
                pauseTimer[0]++;
                if (spEdge || pauseTimer[0] > 180) {
                    downs[0]++;
                    if (downs[0] >= MAX_DOWNS) {
                        gState[0] = 3;
                        pauseMsg[0]  = touchdowns[0] > 0
                            ? "GAME OVER — " + touchdowns[0] + " TD" + (touchdowns[0] > 1 ? "s!" : "!") + " 🦅"
                            : "GAME OVER — No TDs. Rise Up next time!";
                        pauseGood[0] = touchdowns[0] > 0;
                    } else {
                        resetDown.run();
                        gState[0] = 0;
                    }
                }
                canvas.repaint();
                long el = System.currentTimeMillis() - t0;
                if (FRAME_MS - el > 0) try { Thread.sleep(FRAME_MS - el); } catch (InterruptedException ie) {}
                continue;
            }

            if (gState[0] == 3) {
                if (spEdge) break;
                canvas.repaint();
                long el = System.currentTimeMillis() - t0;
                if (FRAME_MS - el > 0) try { Thread.sleep(FRAME_MS - el); } catch (InterruptedException ie) {}
                continue;
            }

            // ── Juke logic ─────────────────────────────────────────────────
            if (spEdge && !juking[0]) {
                juking[0]    = true;
                jukeTimer[0] = 0;
                // Juke boost: perpendicular to current movement direction
                double jmag = chosenJuke * 5.5;
                jukeVX[0] = kL[0] ? -jmag : kR[0] ? jmag : (rng.nextDouble() > 0.5 ? jmag : -jmag);
                jukeVY[0] = kU[0] ? -jmag * 0.5 : kD[0] ? jmag * 0.3 : -jmag * 0.4;
            }
            if (juking[0]) {
                jukeTimer[0]++;
                if (jukeTimer[0] > 30) {
                    juking[0] = false;
                    jukeVX[0] = 0;
                    jukeVY[0] = 0;
                }
            }

            // ── Player movement ────────────────────────────────────────────
            double spd = chosenSpeed + (juking[0] ? chosenJuke * 1.8 : 0);
            double mvX = 0, mvY = 0;
            if (kL[0]) mvX -= spd;
            if (kR[0]) mvX += spd;
            if (kU[0]) mvY -= spd;
            if (kD[0]) mvY += spd;

            // Apply juke velocity (decays)
            mvX += jukeVX[0] * (juking[0] ? 0.35 : 0);
            mvY += jukeVY[0] * (juking[0] ? 0.35 : 0);

            double npx = Math.max(PLAYER_R, Math.min(W - PLAYER_R, px[0] + mvX));
            double npy = Math.max(FIELD_TOP + EZ_HEIGHT + PLAYER_R, Math.min(FIELD_BOTTOM - PLAYER_R, py[0] + mvY));

            // ── Collision check ────────────────────────────────────────────
            boolean tackled = false;
            for (int i = 0; i < NUM_DEF; i++) {
                double cdx = npx - dx2[i], cdy = npy - dy2[i];
                if (Math.sqrt(cdx*cdx + cdy*cdy) < PLAYER_R + DEF_R - 3) {
                    // Juke provides brief invincibility window
                    if (!juking[0]) { tackled = true; break; }
                }
            }

            if (!tackled) { px[0] = npx; py[0] = npy; }

            // ── Touchdown check ────────────────────────────────────────────
            if (py[0] <= FIELD_TOP + EZ_HEIGHT + PLAYER_R) {
                touchdowns[0]++;
                totalScore[0] += 6;
                gState[0]    = downs[0] + 1 >= MAX_DOWNS ? 3 : 1;
                pauseMsg[0]  = "TOUCHDOWN! +6 🏈🎉";
                pauseGood[0] = true;
                pauseTimer[0] = 0;
                if (gState[0] == 3) {
                    pauseMsg[0] = "GAME OVER — " + touchdowns[0] + " TDs! " + totalScore[0] + " pts! RISE UP! 🦅";
                    pauseGood[0] = true;
                }
                canvas.repaint();
                long el = System.currentTimeMillis() - t0;
                if (FRAME_MS - el > 0) try { Thread.sleep(FRAME_MS - el); } catch (InterruptedException ie) {}
                continue;
            }

            // ── Tackle result ──────────────────────────────────────────────
            if (tackled) {
                gState[0]    = downs[0] + 1 >= MAX_DOWNS ? 3 : 2;
                pauseMsg[0]  = "TACKLED! 💥 Down " + (downs[0] + 1) + " over";
                pauseGood[0] = false;
                pauseTimer[0] = 0;
                if (gState[0] == 3) {
                    pauseMsg[0]  = touchdowns[0] > 0
                        ? "GAME OVER — " + touchdowns[0] + " TD" + (touchdowns[0] > 1 ? "s" : "") + "! " + totalScore[0] + " pts!"
                        : "GAME OVER — No TDs. Work on those jukes! 😤";
                    pauseGood[0] = touchdowns[0] > 0;
                }
                canvas.repaint();
                long el = System.currentTimeMillis() - t0;
                if (FRAME_MS - el > 0) try { Thread.sleep(FRAME_MS - el); } catch (InterruptedException ie) {}
                continue;
            }

            // ── AI defender movement ───────────────────────────────────────
            double diffMult = 1.0 + downs[0] * 0.22;
            for (int i = 0; i < NUM_DEF; i++) {
                double aiSpd = (2.0 + i * 0.3) * diffMult;
                double tdx   = px[0] - dx2[i];
                double tdy   = py[0] - dy2[i];
                double dist  = Math.sqrt(tdx*tdx + tdy*tdy);
                if (dist > 1) {
                    // Lead the player slightly based on their velocity
                    double leadX = tdx / dist + mvX * 0.12;
                    double leadY = tdy / dist + mvY * 0.12;
                    double lLen  = Math.sqrt(leadX*leadX + leadY*leadY);
                    if (lLen > 0) { leadX /= lLen; leadY /= lLen; }
                    // Add lateral variation per defender
                    double wiggle = Math.sin(frameCount * 0.07 + i * 2.1) * 0.3;
                    dx2[i] += (leadX + wiggle) * aiSpd;
                    dy2[i] += leadY * aiSpd;
                }
                dx2[i] = Math.max(DEF_R, Math.min(W - DEF_R, dx2[i]));
                dy2[i] = Math.max(FIELD_TOP + EZ_HEIGHT + DEF_R, Math.min(FIELD_BOTTOM - DEF_R, dy2[i]));
            }

            canvas.repaint();
            long elapsed = System.currentTimeMillis() - t0;
            if (FRAME_MS - elapsed > 0) try { Thread.sleep(FRAME_MS - elapsed); } catch (InterruptedException ie) {}
        }

        gf.dispose();

        // ── Final results ──────────────────────────────────────────────────────
        int td = touchdowns[0];
        String rating, rColor;
        if      (td >= MAX_DOWNS) { rating = "🏆 PERFECT GAME! Every down a TD!"; rColor = "#FFD700"; }
        else if (td == 2)         { rating = "⭐ Outstanding! 2 touchdowns!";      rColor = "#A71930"; }
        else if (td == 1)         { rating = "👍 Nice run! 1 TD scored!";           rColor = "#A71930"; }
        else                      { rating = "😤 No TDs — work on those jukes!";    rColor = "#A5ACAF"; }

        JOptionPane.showMessageDialog(null,
            "<html><body style='width:360px;background:#000;color:#fff;text-align:center;font-family:Arial,sans-serif;'>" +
            "<div style='background:#A71930;padding:14px;margin-bottom:12px;'>" +
            "<h2 style='color:#fff;margin:4px;'>🏃 RB JUKE RUN — RESULTS</h2>" +
            "<p style='color:#fff;font-size:12px;margin:4px;'>" + chosenName + "</p></div>" +
            "<p style='font-size:30px;font-weight:bold;color:#fff;margin:12px;'>" +
            td + " TD" + (td != 1 ? "s" : "") + " — " + totalScore[0] + " pts</p>" +
            "<p style='font-size:14px;color:" + rColor + ";font-weight:bold;margin:10px;'>" + rating + "</p>" +
            "<div style='background:#A71930;padding:8px;margin-top:10px;'><b style='color:#fff;'>RISE UP! 🦅</b></div>" +
            "</body></html>",
            "RB Juke Run — Results", JOptionPane.INFORMATION_MESSAGE);
    }

    // Draw a player sprite (circle with label)
    private static void drawRBPlayer(java.awt.Graphics2D g, int cx, int cy,
                                     java.awt.Color jersey, java.awt.Color txt,
                                     String label, boolean hasBall) {
        final int R = 14;
        g.setColor(new java.awt.Color(0, 0, 0, 55));
        g.fillOval(cx - R + 2, cy - R + 5, R * 2, R * 2);
        g.setColor(jersey);
        g.fillOval(cx - R, cy - R, R * 2, R * 2);
        g.setColor(new java.awt.Color(255, 255, 255, 55));
        g.fillOval(cx - R + 3, cy - R + 2, R - 2, R - 4);
        g.setColor(new java.awt.Color(255, 255, 255, 110));
        g.setStroke(new java.awt.BasicStroke(1.5f));
        g.drawOval(cx - R, cy - R, R * 2, R * 2);
        g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 8));
        g.setColor(txt);
        java.awt.FontMetrics fm = g.getFontMetrics();
        g.drawString(label, cx - fm.stringWidth(label) / 2, cy + 3);
        if (hasBall) {
            g.setColor(new java.awt.Color(0xC4, 0x7C, 0x25));
            g.fillOval(cx + R - 4, cy - R - 2, 10, 7);
            g.setColor(java.awt.Color.WHITE);
            g.setStroke(new java.awt.BasicStroke(0.8f));
            g.drawLine(cx + R - 1, cy - R + 1, cx + R + 5, cy - R + 5);
        }
    }

    // ═══════════════════════════════════════════════════════════════════════════
    //  FALCONS OFFENSE GAME
    // ═══════════════════════════════════════════════════════════════════════════

    // ── Player data record ──────────────────────────────────────────────────
    static class FalconsPlayer {
        String name, pos, number, desc;
        // Attributes 1-10
        int speed, acceleration, strength, agility, catching, awareness;
        java.awt.Color jerseyColor;

        FalconsPlayer(String name, String pos, String number, String desc,
                      int speed, int accel, int strength, int agility, int catching, int awareness,
                      java.awt.Color jersey) {
            this.name = name; this.pos = pos; this.number = number; this.desc = desc;
            this.speed = speed; this.acceleration = accel; this.strength = strength;
            this.agility = agility; this.catching = catching; this.awareness = awareness;
            this.jerseyColor = jersey;
        }
        double moveSpeed()   { return 2.8 + speed * 0.22 + acceleration * 0.08; }
        double jukeStrength(){ return agility * 0.18 + awareness * 0.05; }
        double breakTackle() { return strength * 0.12 + agility * 0.06; }
    }

    private static void playFalconsOffense() {
        java.awt.Color falconsRed  = new java.awt.Color(0xA7, 0x19, 0x30);
        java.awt.Color falconsBlk  = new java.awt.Color(0x10, 0x10, 0x10);
        java.awt.Color receiverBlue= new java.awt.Color(0x0D, 0x47, 0xA1);
        java.awt.Color teGreen     = new java.awt.Color(0x1B, 0x5E, 0x20);
        java.awt.Color qbGold      = new java.awt.Color(0xF5, 0x7F, 0x17);

        // ── Roster by position ────────────────────────────────────────────────
        FalconsPlayer[] qbs = {
            new FalconsPlayer("Kirk Cousins","QB","#18",
                "14-yr veteran. Smart, accurate pocket passer. Elite awareness & touch.",
                6,5,5,6,7,10, qbGold),
            new FalconsPlayer("Easton Stick","QB","#12",
                "Mobile backup QB. Faster legs, reads defense well under pressure.",
                7,7,5,7,6,7, qbGold)
        };
        FalconsPlayer[] rbs = {
            new FalconsPlayer("Bijan Robinson","RB","#7",
                "Top-10 RB in NFL. Explosive burst, elite vision, great hands.",
                9,9,7,9,8,8, falconsRed),
            new FalconsPlayer("Tyler Allgeier","RB","#25",
                "Powerful downhill runner. Hard to bring down, physical style.",
                7,7,9,7,6,6, falconsRed),
            new FalconsPlayer("Nate Carter","RB","#38",
                "Rookie speedster. Fastest RB on roster, still developing awareness.",
                10,8,5,7,5,5, falconsRed)
        };
        FalconsPlayer[] wrs = {
            new FalconsPlayer("Drake London","WR","#5",
                "6'4\" physical receiver. Dominant 50-50 balls, strong after catch.",
                7,7,8,7,9,7, receiverBlue),
            new FalconsPlayer("Darnell Mooney","WR","#1",
                "Speedy slot threat. Routes are crisp, separates quickly.",
                9,9,5,8,8,7, receiverBlue),
            new FalconsPlayer("Malik Heath","WR","#18",
                "Big-bodied WR2. Contested catch specialist, red zone weapon.",
                6,6,7,6,8,6, receiverBlue)
        };
        FalconsPlayer[] tes = {
            new FalconsPlayer("Kyle Pitts","TE","#8",
                "Generational talent. Freakish athleticism for a TE, matchup nightmare.",
                8,8,7,8,10,7, teGreen),
            new FalconsPlayer("Charlie Woerner","TE","#89",
                "Veteran blocking TE. Physical run blocker, reliable short-route target.",
                6,5,8,5,7,7, teGreen),
            new FalconsPlayer("Feleipe Franks","TE","#84",
                "Former QB turned TE. Athletic, good hands, solid all-around.",
                7,6,7,7,8,6, teGreen)
        };

        // ── Position select screen ─────────────────────────────────────────────
        String[] posOpts = {
            "🏈 Quarterback (QB) — Scramble & pass",
            "🏃 Running Back (RB) — Run & juke",
            "📡 Wide Receiver (WR) — Run routes & catch",
            "💪 Tight End (TE) — Blocking & receiving"
        };
        int posChoice = JOptionPane.showOptionDialog(null,
            "<html><body style='width:460px;background:#000;color:#fff;text-align:center;font-family:Arial,sans-serif;'>" +
            "<div style='background:#A71930;padding:14px;margin-bottom:12px;'>" +
            "<h2 style='color:#fff;margin:4px;'>🏟️ FALCONS OFFENSE 🏟️</h2>" +
            "<p style='color:#fff;margin:4px;font-size:12px;'>2026 Atlanta Falcons — Score the Touchdown!</p></div>" +
            "<p style='color:#fff;font-size:13px;margin:10px 0;'>Choose a <b style='color:#FFD700;'>position</b> to play — each has unique gameplay:</p>" +
            "<div style='background:#1a1a1a;padding:10px;border:2px solid #A71930;margin:8px 0;text-align:left;font-size:12px;'>" +
            "<p style='color:#A5ACAF;margin:4px;'>🏈 <b>QB</b> — Scramble to avoid the pass rush. Press SPACE to throw downfield!<br>" +
            "🏃 <b>RB</b> — Take the handoff and juke through defenders<br>" +
            "📡 <b>WR</b> — Run your route, find the gap, make the catch!<br>" +
            "💪 <b>TE</b> — Use your size to bully through defenders</p></div>" +
            "<p style='color:#FFD700;font-size:11px;margin:8px;'>Arrow Keys = Move &nbsp;|&nbsp; SPACE = Special Action &nbsp;|&nbsp; 3 Downs to score TDs!</p>" +
            "</body></html>",
            "Falcons Offense — Choose Position",
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, posOpts, posOpts[0]);
        if (posChoice < 0) return;

        // ── Player select for that position ───────────────────────────────────
        FalconsPlayer[] roster = posChoice == 0 ? qbs : posChoice == 1 ? rbs : posChoice == 2 ? wrs : tes;

        // Build display strings with stat bars
        String[] playerDisplays = new String[roster.length];
        for (int i = 0; i < roster.length; i++) {
            FalconsPlayer p = roster[i];
            playerDisplays[i] = p.name + " " + p.number +
                " | SPD:" + p.speed + " AGI:" + p.agility +
                " STR:" + p.strength + " CAT:" + p.catching + " AWR:" + p.awareness;
        }

        // Build rich HTML for the player select dialog
        StringBuilder pHtml = new StringBuilder(
            "<html><body style='width:500px;background:#000;color:#fff;font-family:Arial,sans-serif;'>" +
            "<div style='background:#A71930;padding:10px;margin-bottom:10px;text-align:center;'>" +
            "<h3 style='color:#fff;margin:4px;'>Choose Your " + posOpts[posChoice].substring(3) + "</h3></div>");
        for (FalconsPlayer p : roster) {
            pHtml.append("<div style='background:#1a1a1a;margin:6px;padding:8px;border-left:4px solid #A71930;'>");
            pHtml.append("<b style='color:#FFD700;font-size:13px;'>").append(p.name).append(" ").append(p.number).append("</b>");
            pHtml.append("<span style='color:#A5ACAF;font-size:11px;'> — ").append(p.desc).append("</span><br>");
            pHtml.append("<span style='color:#fff;font-size:11px;'>SPD:").append(statBar(p.speed));
            pHtml.append(" AGI:").append(statBar(p.agility));
            pHtml.append(" STR:").append(statBar(p.strength));
            pHtml.append(" CAT:").append(statBar(p.catching));
            pHtml.append(" AWR:").append(statBar(p.awareness)).append("</span></div>");
        }
        pHtml.append("</body></html>");

        int playerPick = JOptionPane.showOptionDialog(null, pHtml.toString(),
            "Pick Your Player",
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, playerDisplays, playerDisplays[0]);
        if (playerPick < 0) return;

        FalconsPlayer chosen = roster[playerPick];

        // ── Show player card + controls ────────────────────────────────────────
        String specialAction = posChoice == 0 ? "SPACE = Throw (pass rush burst!)"
                             : posChoice == 1 ? "SPACE = Juke move!"
                             : posChoice == 2 ? "SPACE = Speed burst (route break)"
                             :                  "SPACE = Power drive (break tackle)";

        JOptionPane.showMessageDialog(null,
            "<html><body style='width:420px;background:#000;color:#fff;text-align:center;font-family:Arial,sans-serif;'>" +
            "<div style='background:#A71930;padding:12px;margin-bottom:10px;'>" +
            "<h3 style='color:#fff;margin:4px;'>" + chosen.name + " " + chosen.number + "</h3>" +
            "<p style='color:#A5ACAF;margin:4px;font-size:12px;'>" + chosen.pos + " — " + chosen.desc + "</p></div>" +
            "<table style='width:100%;color:#fff;font-size:12px;margin:8px 0;'>" +
            "<tr><td style='padding:3px;'><b style='color:#FFD700;'>Speed:</b></td><td>" + statBar(chosen.speed) + " (" + chosen.speed + "/10)</td>" +
            "<td style='padding:3px;'><b style='color:#FFD700;'>Agility:</b></td><td>" + statBar(chosen.agility) + " (" + chosen.agility + "/10)</td></tr>" +
            "<tr><td style='padding:3px;'><b style='color:#FFD700;'>Strength:</b></td><td>" + statBar(chosen.strength) + " (" + chosen.strength + "/10)</td>" +
            "<td style='padding:3px;'><b style='color:#FFD700;'>Catching:</b></td><td>" + statBar(chosen.catching) + " (" + chosen.catching + "/10)</td></tr>" +
            "<tr><td style='padding:3px;' colspan='2'><b style='color:#FFD700;'>Awareness:</b> " + statBar(chosen.awareness) + " (" + chosen.awareness + "/10)</td></tr>" +
            "</table>" +
            "<div style='background:#1a1a1a;padding:10px;border:2px solid #A71930;margin:8px 0;text-align:left;'>" +
            "<p style='color:#FFD700;font-weight:bold;margin:4px;'>CONTROLS:</p>" +
            "<p style='color:#A5ACAF;font-size:12px;margin:4px;'>⬆️⬇️⬅️➡️ Arrow Keys — Move<br>" + specialAction + "</p></div>" +
            "<div style='background:#A71930;padding:8px;margin-top:8px;'><b style='color:#fff;'>RISE UP! 🦅</b></div>" +
            "</body></html>",
            "Player Card", JOptionPane.INFORMATION_MESSAGE);

        // ── Launch animated game ───────────────────────────────────────────────
        runOffenseGame(chosen, posChoice);
    }

    private static String statBar(int val) {
        // Returns a text mini-bar e.g. "████░░" for val out of 10
        StringBuilder sb = new StringBuilder("<span style='color:#A71930;'>");
        for (int i = 0; i < 10; i++) {
            if (i < val) sb.append("█");
            else sb.append("<span style='color:#333;'>░</span>");
        }
        sb.append("</span>");
        return sb.toString();
    }

    private static void runOffenseGame(FalconsPlayer player, int posMode) {
        // posMode: 0=QB, 1=RB, 2=WR, 3=TE

        final int W = 760, H = 580;
        final int FIELD_TOP    = 70;
        final int FIELD_BOTTOM = H - 50;
        final int EZ_HEIGHT    = 70;

        final java.awt.Color RED    = new java.awt.Color(0xA7, 0x19, 0x30);
        final java.awt.Color GOLD   = new java.awt.Color(0xFF, 0xD7, 0x00);
        final java.awt.Color GRASS1 = new java.awt.Color(0x2E, 0x7D, 0x32);
        final java.awt.Color GRASS2 = new java.awt.Color(0x38, 0x8E, 0x3C);
        final java.awt.Color BLACK  = new java.awt.Color(0x10, 0x10, 0x10);
        final java.awt.Color SILVER = new java.awt.Color(0xA5, 0xAC, 0xAF);
        final java.awt.Color NAVY   = new java.awt.Color(0x1A, 0x37, 0x7C);

        final int MAX_DOWNS = 4;
        final int[] downs      = {0};
        final int[] touchdowns = {0};
        final int[] totalScore = {0};
        final int[] yards      = {0};   // yards gained this run
        final int[] firstDownY = {FIELD_BOTTOM - 160}; // first down marker y

        // Player
        final double[] px = {W / 2.0};
        final double[] py = {FIELD_BOTTOM - 40.0};
        final double[] pvx = {0}, pvy = {0}; // velocity for smooth movement

        // Special action state
        final boolean[] special    = {false};
        final int[]     specTimer  = {0};
        final int       SPEC_DUR   = 35;
        // QB: pass arc state
        final boolean[] ballInAir  = {false};
        final double[]  ballX      = {0}, ballY = {0};
        final double[]  ballVx     = {0}, ballVy = {0};
        final int[]     ballTimer  = {0};

        // Defenders — number depends on position
        final int NUM_DEF = posMode == 0 ? 3 : posMode == 3 ? 4 : 4;
        final double[] dx = new double[NUM_DEF];
        final double[] dy = new double[NUM_DEF];
        // Defender types: 0=DE/blitzer, 1=LB/pursuit, 2=CB/cover, 3=S/deep
        final int[]    dtype = new int[NUM_DEF];
        // Whether a defender is blocked (TE power-drive stun)
        final boolean[]  stunned  = new boolean[NUM_DEF];
        final int[]      stunTimer= new int[NUM_DEF];

        java.util.Random rng = new java.util.Random();

        Runnable resetDown = () -> {
            px[0] = W / 2.0 + (rng.nextDouble() - 0.5) * 60;
            py[0] = FIELD_BOTTOM - 40.0;
            pvx[0] = 0; pvy[0] = 0;
            special[0] = false; specTimer[0] = 0;
            ballInAir[0] = false;

            double diffMult = 1.0 + downs[0] * 0.15;
            // Spread defenders by type
            int[] defTypes = posMode == 0 ? new int[]{0,0,1}
                           : posMode == 1 ? new int[]{0,1,1,2}
                           : posMode == 2 ? new int[]{0,1,2,3}
                           :                new int[]{0,0,1,1};
            for (int i = 0; i < NUM_DEF; i++) {
                dtype[i] = i < defTypes.length ? defTypes[i] : 1;
                stunned[i] = false; stunTimer[i] = 0;
                switch (dtype[i]) {
                    case 0: // DE — line near scrimmage
                        dx[i] = 120 + i * 220 + rng.nextInt(60);
                        dy[i] = FIELD_TOP + EZ_HEIGHT + 60 + rng.nextInt(50);
                        break;
                    case 1: // LB — mid-field
                        dx[i] = 100 + i * 200 + rng.nextInt(80);
                        dy[i] = FIELD_TOP + EZ_HEIGHT + 130 + rng.nextInt(60);
                        break;
                    case 2: // CB — spread wide, deep
                        dx[i] = (i % 2 == 0) ? 60 + rng.nextInt(80) : W - 140 + rng.nextInt(80);
                        dy[i] = FIELD_TOP + EZ_HEIGHT + 80 + rng.nextInt(80);
                        break;
                    case 3: // S — deep center
                        dx[i] = W/2.0 + (rng.nextDouble() - 0.5) * 160;
                        dy[i] = FIELD_TOP + EZ_HEIGHT + 30 + rng.nextInt(50);
                        break;
                }
            }

            firstDownY[0] = (int)(FIELD_BOTTOM - 160 - downs[0] * 30);
            yards[0] = 0;
        };
        resetDown.run();

        // Keys
        final boolean[] kL={false},kR={false},kU={false},kD={false},kSp={false};
        final boolean[] spWas={false};
        final int[]     gState    = {0};  // 0=play,1=td,2=tackle/fail,3=gameover,4=firstdown
        final int[]     pauseTimer= {0};
        final String[]  pauseMsg  = {""};
        final boolean[] pauseGood = {false};
        final int[]     frameCount= {0};

        javax.swing.JFrame gf = new javax.swing.JFrame(
            "🏟️ Falcons Offense — " + player.name + " " + player.number);
        gf.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        gf.setResizable(false);

        // ── Yard labels along field ────────────────────────────────────────────
        int fieldH = FIELD_BOTTOM - FIELD_TOP - EZ_HEIGHT;
        int[] yardLineY = new int[6];
        String[] yardLabels = {"10","20","30","40","50","40"};
        for (int i = 0; i < 6; i++)
            yardLineY[i] = FIELD_TOP + EZ_HEIGHT + (int)((i+1) * fieldH / 7.0);

        // Special action label per position
        String specLabel = posMode == 0 ? "THROW" : posMode == 1 ? "JUKE" : posMode == 2 ? "BURST" : "DRIVE";

        javax.swing.JPanel canvas = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g0) {
                super.paintComponent(g0);
                java.awt.Graphics2D g = (java.awt.Graphics2D) g0;
                g.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                   java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
                g.setRenderingHint(java.awt.RenderingHints.KEY_TEXT_ANTIALIASING,
                                   java.awt.RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

                // ── Grass ─────────────────────────────────────────────────
                for (int sy = FIELD_TOP + EZ_HEIGHT; sy < FIELD_BOTTOM; sy += 55) {
                    int row = (sy - FIELD_TOP - EZ_HEIGHT) / 55;
                    g.setColor(row % 2 == 0 ? GRASS1 : GRASS2);
                    g.fillRect(0, sy, W, Math.min(55, FIELD_BOTTOM - sy));
                }

                // ── End zone ──────────────────────────────────────────────
                g.setColor(RED);
                g.fillRect(0, FIELD_TOP, W, EZ_HEIGHT);
                // EZ diagonal lines
                g.setColor(new java.awt.Color(255,255,255,20));
                for (int lx = -EZ_HEIGHT; lx < W; lx += 30)
                    g.drawLine(lx, FIELD_TOP, lx + EZ_HEIGHT, FIELD_TOP + EZ_HEIGHT);
                g.setColor(java.awt.Color.WHITE);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
                java.awt.FontMetrics fm2 = g.getFontMetrics();
                String ezTxt = "FALCONS END ZONE 🦅";
                g.drawString(ezTxt, (W - fm2.stringWidth(ezTxt))/2, FIELD_TOP + 44);

                // ── Crowd ─────────────────────────────────────────────────
                g.setColor(BLACK);
                g.fillRect(0, 0, W, FIELD_TOP);
                java.util.Random dr = new java.util.Random(99);
                for (int d = 0; d < 160; d++) {
                    int crowd = dr.nextInt(4);
                    g.setColor(crowd == 0 ? new java.awt.Color(0xA7,0x19,0x30,180)
                             : crowd == 1 ? new java.awt.Color(0x22,0x22,0x22,180)
                             : new java.awt.Color(0xFF,0xFF,0xFF,80));
                    g.fillOval(dr.nextInt(W), dr.nextInt(FIELD_TOP-2)+1, 5, 5);
                }

                // ── Yard lines ────────────────────────────────────────────
                g.setStroke(new java.awt.BasicStroke(1.5f));
                g.setColor(new java.awt.Color(255,255,255,100));
                for (int yly : yardLineY) g.drawLine(0, yly, W, yly);
                // Yard numbers
                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
                g.setColor(new java.awt.Color(255,255,255,130));
                for (int i = 0; i < yardLineY.length; i++) {
                    g.drawString(yardLabels[i], 8, yardLineY[i] - 3);
                    g.drawString(yardLabels[i], W - 26, yardLineY[i] - 3);
                }

                // ── Hash marks ────────────────────────────────────────────
                g.setColor(new java.awt.Color(255,255,255,60));
                g.setStroke(new java.awt.BasicStroke(1f));
                int hcx = W/2;
                for (int sy = FIELD_TOP + EZ_HEIGHT + 15; sy < FIELD_BOTTOM; sy += 25) {
                    g.drawLine(hcx-20, sy, hcx-6, sy);
                    g.drawLine(hcx+6, sy, hcx+20, sy);
                }

                // ── First down marker ─────────────────────────────────────
                g.setColor(new java.awt.Color(0xFF, 0xC1, 0x07, 200));
                g.setStroke(new java.awt.BasicStroke(3f));
                g.drawLine(0, firstDownY[0], W, firstDownY[0]);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 10));
                g.setColor(new java.awt.Color(0xFF, 0xC1, 0x07));
                g.drawString("1ST DOWN", W - 72, firstDownY[0] - 3);

                // ── Bottom area / HUD ──────────────────────────────────────
                g.setColor(BLACK);
                g.fillRect(0, FIELD_BOTTOM, W, H - FIELD_BOTTOM);
                g.setColor(RED);
                g.fillRect(0, FIELD_BOTTOM, W, 3);

                // Down indicator dots
                for (int d = 0; d < MAX_DOWNS; d++) {
                    g.setColor(d < downs[0] ? new java.awt.Color(0x55,0x55,0x55)
                             : d == downs[0] ? RED : new java.awt.Color(0x33,0x33,0x33));
                    g.fillOval(12 + d * 18, FIELD_BOTTOM + 8, 12, 12);
                    if (d == downs[0]) {
                        g.setColor(GOLD);
                        g.setStroke(new java.awt.BasicStroke(1.5f));
                        g.drawOval(12 + d * 18, FIELD_BOTTOM + 8, 12, 12);
                    }
                }
                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
                g.setColor(java.awt.Color.WHITE);
                g.drawString("Down " + (downs[0]+1) + "/" + MAX_DOWNS, 90, FIELD_BOTTOM + 20);

                // Player name & score
                g.setColor(SILVER);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 11));
                g.drawString(player.name + " " + player.number, 200, FIELD_BOTTOM + 12);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 13));
                g.setColor(GOLD);
                g.drawString("TDs: " + touchdowns[0] + "  (" + totalScore[0] + " pts)", 200, FIELD_BOTTOM + 27);

                // Controls hint
                g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 10));
                g.setColor(SILVER);
                g.drawString("⬆⬇⬅➡ Move   |   SPACE = " + specLabel, 430, FIELD_BOTTOM + 18);

                // Stat mini-bar
                g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 9));
                g.setColor(new java.awt.Color(0xA5,0xAC,0xAF,160));
                g.drawString("SPD:" + player.speed + " AGI:" + player.agility +
                             " STR:" + player.strength + " CAT:" + player.catching +
                             " AWR:" + player.awareness, 430, FIELD_BOTTOM + 32);

                // ── Special action bar (top right) ─────────────────────────
                int sBarX = W - 115, sBarY = FIELD_TOP + 8;
                g.setColor(new java.awt.Color(0,0,0,170));
                g.fillRoundRect(sBarX - 4, sBarY - 14, 120, 30, 6, 6);
                g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 9));
                g.setColor(special[0] ? GOLD : new java.awt.Color(0x00,0xCC,0x44));
                g.drawString("SPACE: " + specLabel, sBarX, sBarY);
                int sbW = 108, sbH = 8;
                g.setColor(new java.awt.Color(0x33,0x33,0x33));
                g.fillRoundRect(sBarX, sBarY + 3, sbW, sbH, 4, 4);
                double specCool = special[0] ? 1.0 - ((double)specTimer[0] / SPEC_DUR) : 1.0;
                g.setColor(special[0] ? GOLD : new java.awt.Color(0x00,0xCC,0x44));
                g.fillRoundRect(sBarX, sBarY + 3, (int)(sbW * specCool), sbH, 4, 4);

                // ── Defenders ─────────────────────────────────────────────
                String[] defLabels = {"DE","LB","CB","S","DT"};
                java.awt.Color[] defColors = {
                    new java.awt.Color(0x1A,0x37,0x7C),
                    new java.awt.Color(0x0D,0x2D,0x6B),
                    new java.awt.Color(0x26,0x3D,0x8F),
                    new java.awt.Color(0x1E,0x3A,0x8A)
                };
                for (int i = 0; i < NUM_DEF; i++) {
                    java.awt.Color dc = stunned[i]
                        ? new java.awt.Color(0x55,0x55,0x55)
                        : defColors[dtype[i] % defColors.length];
                    drawOffensePlayer(g, (int)dx[i], (int)dy[i], dc,
                        java.awt.Color.WHITE, defLabels[dtype[i] % defLabels.length], false, false);
                    // stun stars
                    if (stunned[i]) {
                        g.setColor(GOLD);
                        g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 10));
                        g.drawString("★★", (int)dx[i]-8, (int)dy[i]-18);
                    }
                }

                // ── Flying ball (QB throw) ─────────────────────────────────
                if (ballInAir[0]) {
                    double bSize = 10 - ballTimer[0] * 0.05;
                    bSize = Math.max(4, bSize);
                    g.setColor(new java.awt.Color(0xC4,0x7C,0x25));
                    g.fillOval((int)ballX[0] - (int)(bSize/2), (int)ballY[0] - (int)(bSize/2),
                               (int)bSize, (int)bSize);
                    // trail
                    g.setColor(new java.awt.Color(0xFF,0xFF,0xFF,60));
                    g.fillOval((int)(ballX[0]-ballVx[0]*2) - 3, (int)(ballY[0]-ballVy[0]*2) - 3, 6, 6);
                }

                // ── Player ────────────────────────────────────────────────
                drawOffensePlayer(g, (int)px[0], (int)py[0], player.jerseyColor,
                    java.awt.Color.WHITE, player.pos, true, special[0]);

                // Speed trail for special moves
                if (special[0]) {
                    float alpha = 0.4f - specTimer[0] * 0.012f;
                    if (alpha > 0) {
                        g.setColor(new java.awt.Color(
                            player.jerseyColor.getRed()/255f,
                            player.jerseyColor.getGreen()/255f,
                            player.jerseyColor.getBlue()/255f, Math.max(0,alpha)));
                        g.fillOval((int)(px[0]-pvx[0]*3)-10, (int)(py[0]-pvy[0]*3)-10, 20, 20);
                    }
                }

                // ── Pause overlay ─────────────────────────────────────────
                if (gState[0] >= 1) {
                    g.setColor(new java.awt.Color(0,0,0,175));
                    g.fillRect(0, H/2-65, W, 130);
                    g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 28));
                    g.setColor(pauseGood[0] ? new java.awt.Color(0x00,0xCC,0x44) : new java.awt.Color(0xFF,0x33,0x33));
                    java.awt.FontMetrics pfm = g.getFontMetrics();
                    g.drawString(pauseMsg[0], (W-pfm.stringWidth(pauseMsg[0]))/2, H/2-18);
                    g.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
                    g.setColor(java.awt.Color.WHITE);
                    String sub = gState[0] == 3 ? "Press SPACE to see final results"
                               : gState[0] == 4 ? "First down! Press SPACE for next play"
                               : "Press SPACE to run next down...";
                    pfm = g.getFontMetrics();
                    g.drawString(sub, (W-pfm.stringWidth(sub))/2, H/2+18);
                }
            }
        };
        canvas.setPreferredSize(new java.awt.Dimension(W, H));
        canvas.setBackground(GRASS1);
        canvas.setFocusable(true);

        canvas.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override public void keyPressed(java.awt.event.KeyEvent e) {
                switch (e.getKeyCode()) {
                    case java.awt.event.KeyEvent.VK_LEFT:  kL[0]=true; break;
                    case java.awt.event.KeyEvent.VK_RIGHT: kR[0]=true; break;
                    case java.awt.event.KeyEvent.VK_UP:    kU[0]=true; break;
                    case java.awt.event.KeyEvent.VK_DOWN:  kD[0]=true; break;
                    case java.awt.event.KeyEvent.VK_SPACE: kSp[0]=true; break;
                }
            }
            @Override public void keyReleased(java.awt.event.KeyEvent e) {
                switch (e.getKeyCode()) {
                    case java.awt.event.KeyEvent.VK_LEFT:  kL[0]=false; break;
                    case java.awt.event.KeyEvent.VK_RIGHT: kR[0]=false; break;
                    case java.awt.event.KeyEvent.VK_UP:    kU[0]=false; break;
                    case java.awt.event.KeyEvent.VK_DOWN:  kD[0]=false; break;
                    case java.awt.event.KeyEvent.VK_SPACE: kSp[0]=false; break;
                }
            }
        });

        gf.setContentPane(canvas);
        gf.pack();
        gf.setLocationRelativeTo(null);
        gf.setVisible(true);
        canvas.requestFocusInWindow();

        final int PR = 14, DR = 14;
        final long FRAME_MS = 1000 / 60;

        // ── Game loop ──────────────────────────────────────────────────────────
        while (gf.isVisible()) {
            long t0 = System.currentTimeMillis();
            frameCount[0]++;

            boolean spEdge = kSp[0] && !spWas[0];
            spWas[0] = kSp[0];

            // ── Pause handling ─────────────────────────────────────────────
            if (gState[0] >= 1) {
                pauseTimer[0]++;
                if (spEdge || pauseTimer[0] > 200) {
                    if (gState[0] == 3) break;
                    downs[0]++;
                    if (downs[0] >= MAX_DOWNS) {
                        gState[0] = 3;
                        boolean won = touchdowns[0] > 0;
                        pauseMsg[0]  = won ? "FINAL: " + touchdowns[0] + " TDs — " + totalScore[0] + " pts! RISE UP! 🦅"
                                           : "FINAL: No TDs. Work on those routes!";
                        pauseGood[0] = won;
                    } else {
                        resetDown.run();
                        gState[0] = 0;
                    }
                }
                canvas.repaint();
                long el = System.currentTimeMillis()-t0;
                if (FRAME_MS-el>0) try{Thread.sleep(FRAME_MS-el);}catch(InterruptedException e){}
                continue;
            }

            // ── Special action trigger ─────────────────────────────────────
            if (spEdge && !special[0]) {
                special[0]    = true;
                specTimer[0]  = 0;
                if (posMode == 0 && !ballInAir[0]) {
                    // QB throw — launch ball forward
                    ballInAir[0] = true;
                    ballX[0]     = px[0]; ballY[0] = py[0];
                    double throwDir = kL[0] ? -0.4 : kR[0] ? 0.4 : 0.0;
                    ballVx[0]    = throwDir * 6 + (rng.nextDouble()-0.5)*1.5;
                    ballVy[0]    = -9.5 - player.awareness * 0.15;
                    ballTimer[0] = 0;
                }
            }
            if (special[0]) {
                specTimer[0]++;
                if (specTimer[0] > SPEC_DUR) { special[0] = false; }
            }

            // ── Update flying ball (QB) ────────────────────────────────────
            if (ballInAir[0]) {
                ballX[0] += ballVx[0]; ballY[0] += ballVy[0];
                ballVy[0] += 0.28; // gravity
                ballTimer[0]++;
                // Ball lands
                if (ballY[0] > FIELD_BOTTOM || ballTimer[0] > 90) {
                    ballInAir[0] = false;
                }
                // Ball reaches end zone → instant TD (simulated completion)
                if (ballY[0] < FIELD_TOP + EZ_HEIGHT && ballX[0] > 40 && ballX[0] < W-40) {
                    ballInAir[0] = false;
                    touchdowns[0]++;
                    totalScore[0] += 6;
                    gState[0]    = downs[0]+1 >= MAX_DOWNS ? 3 : 1;
                    pauseMsg[0]  = "TOUCHDOWN PASS! +6 🏈🎉";
                    pauseGood[0] = true;
                    pauseTimer[0]= 0;
                    if (gState[0]==3) { pauseMsg[0]="GAME OVER — "+touchdowns[0]+" TDs! RISE UP! 🦅"; pauseGood[0]=true; }
                    canvas.repaint();
                    long el=System.currentTimeMillis()-t0;
                    if(FRAME_MS-el>0)try{Thread.sleep(FRAME_MS-el);}catch(InterruptedException e){}
                    continue;
                }
            }

            // ── Player movement ────────────────────────────────────────────
            double baseSpd = player.moveSpeed() * (special[0] ? 1.45 : 1.0);
            // WR burst (acceleration bonus)
            if (posMode == 2 && special[0]) baseSpd += player.acceleration * 0.1;

            double targetVx = 0, targetVy = 0;
            if (kL[0]) targetVx = -baseSpd;
            if (kR[0]) targetVx =  baseSpd;
            if (kU[0]) targetVy = -baseSpd;
            if (kD[0]) targetVy =  baseSpd;

            // Smooth acceleration using awareness stat
            double accelFactor = 0.25 + player.awareness * 0.025;
            pvx[0] += (targetVx - pvx[0]) * accelFactor;
            pvy[0] += (targetVy - pvy[0]) * accelFactor;

            // TE power drive — lateral juke bonus
            if (posMode == 3 && special[0]) {
                pvx[0] *= 1.3; pvy[0] *= 1.3;
            }

            double npx = Math.max(PR, Math.min(W-PR, px[0]+pvx[0]));
            double npy = Math.max(FIELD_TOP+EZ_HEIGHT+PR, Math.min(FIELD_BOTTOM-PR, py[0]+pvy[0]));

            // ── Defender stun timer ────────────────────────────────────────
            for (int i = 0; i < NUM_DEF; i++) {
                if (stunned[i]) {
                    stunTimer[i]++;
                    if (stunTimer[i] > 90) { stunned[i] = false; }
                }
            }

            // ── Collision detection ────────────────────────────────────────
            boolean tackled = false;
            for (int i = 0; i < NUM_DEF; i++) {
                if (stunned[i]) continue;
                double cdx2 = npx - dx[i], cdy2 = npy - dy[i];
                double dist = Math.sqrt(cdx2*cdx2 + cdy2*cdy2);
                if (dist < PR + DR - 2) {
                    // Special: RB juke (agility check) or TE power drive (strength)
                    boolean escaped = false;
                    if (special[0]) {
                        double escapeChance = (posMode==1) ? player.agility * 0.09
                                           : (posMode==3) ? player.strength * 0.11
                                           :                0.3;
                        if (rng.nextDouble() < escapeChance) {
                            escaped = true;
                            // TE stuns defender on power drive
                            if (posMode == 3) {
                                stunned[i] = true; stunTimer[i] = 0;
                            }
                        }
                    }
                    if (!escaped) {
                        tackled = true;
                    }
                    break;
                }
            }

            if (!tackled) { px[0]=npx; py[0]=npy; }

            // ── TD check ──────────────────────────────────────────────────
            if (!tackled && py[0] <= FIELD_TOP + EZ_HEIGHT + PR) {
                touchdowns[0]++;
                totalScore[0] += 6;
                gState[0] = downs[0]+1 >= MAX_DOWNS ? 3 : 1;
                String tdMsg = posMode==0 ? "QB SCRAMBLE TD! +6 🏈" :
                               posMode==1 ? "RUSHING TOUCHDOWN! +6 🏈🎉" :
                               posMode==2 ? "TOUCHDOWN CATCH! +6 🏈💫" :
                                            "POWER TD! +6 💪🏈";
                pauseMsg[0] = tdMsg; pauseGood[0]=true; pauseTimer[0]=0;
                if (gState[0]==3) { pauseMsg[0]="GAME OVER — "+touchdowns[0]+" TDs! "+totalScore[0]+" pts! 🦅"; pauseGood[0]=true; }
                canvas.repaint();
                long el=System.currentTimeMillis()-t0;
                if(FRAME_MS-el>0)try{Thread.sleep(FRAME_MS-el);}catch(InterruptedException e){}
                continue;
            }

            // ── First down check ──────────────────────────────────────────
            if (!tackled && py[0] < firstDownY[0]) {
                // Passed the first down marker — celebrate briefly then continue
                firstDownY[0] = (int)(py[0] - 120);
                yards[0] += 10;
            }

            // ── Tackle result ─────────────────────────────────────────────
            if (tackled) {
                gState[0] = downs[0]+1 >= MAX_DOWNS ? 3 : 2;
                pauseMsg[0]  = "TACKLED! 💥 End of Down " + (downs[0]+1);
                pauseGood[0] = false; pauseTimer[0] = 0;
                if (gState[0]==3) {
                    boolean won = touchdowns[0]>0;
                    pauseMsg[0] = won ? "GAME OVER — "+touchdowns[0]+" TDs scored!" : "GAME OVER — Held scoreless!";
                    pauseGood[0] = won;
                }
                canvas.repaint();
                long el=System.currentTimeMillis()-t0;
                if(FRAME_MS-el>0)try{Thread.sleep(FRAME_MS-el);}catch(InterruptedException e){}
                continue;
            }

            // ── Defender AI ───────────────────────────────────────────────
            double diffMult = 1.0 + downs[0] * 0.18;
            for (int i = 0; i < NUM_DEF; i++) {
                if (stunned[i]) continue;

                // Target: toward player (with type-specific behavior)
                double tdx2 = px[0] - dx[i], tdy2 = py[0] - dy[i];
                double dist2 = Math.sqrt(tdx2*tdx2 + tdy2*tdy2);
                if (dist2 < 1) continue;

                double aiSpd;
                double moveX, moveY;
                switch (dtype[i]) {
                    case 0: // DE — fast rush straight at player
                        aiSpd  = (2.8 + player.speed * 0.05) * diffMult;
                        moveX  = tdx2/dist2 * aiSpd + Math.sin(frameCount[0]*0.09+i)*0.2;
                        moveY  = tdy2/dist2 * aiSpd;
                        break;
                    case 1: // LB — pursuit, leads slightly
                        aiSpd  = (2.2 + player.awareness*0.04) * diffMult;
                        moveX  = (tdx2/dist2 + pvx[0]*0.15) * aiSpd;
                        moveY  = (tdy2/dist2 + pvy[0]*0.10) * aiSpd;
                        break;
                    case 2: // CB — tries to cut off angle
                        aiSpd  = (2.5 + player.speed*0.04) * diffMult;
                        double interceptX = px[0] + pvx[0]*8;
                        double icdx = interceptX - dx[i];
                        double iclen= Math.sqrt(icdx*icdx + tdy2*tdy2);
                        moveX  = (iclen>1 ? icdx/iclen : tdx2/dist2) * aiSpd;
                        moveY  = tdy2/dist2 * aiSpd;
                        break;
                    case 3: // S — deep zone, only closes in when player gets close
                    default:
                        aiSpd  = dist2 < 200 ? (2.6*diffMult) : (1.2*diffMult);
                        moveX  = tdx2/dist2 * aiSpd + Math.cos(frameCount[0]*0.06+i)*0.3;
                        moveY  = tdy2/dist2 * aiSpd;
                        break;
                }
                dx[i] = Math.max(DR, Math.min(W-DR, dx[i]+moveX));
                dy[i] = Math.max(FIELD_TOP+EZ_HEIGHT+DR, Math.min(FIELD_BOTTOM-DR, dy[i]+moveY));
            }

            canvas.repaint();
            long elapsed = System.currentTimeMillis()-t0;
            if (FRAME_MS-elapsed>0) try{Thread.sleep(FRAME_MS-elapsed);}catch(InterruptedException e){}
        }

        gf.dispose();

        // ── Final results dialog ───────────────────────────────────────────────
        int td = touchdowns[0];
        String rating, rColor;
        if      (td >= MAX_DOWNS) { rating="🏆 PERFECT GAME! TD every single down!"; rColor="#FFD700"; }
        else if (td == 3)         { rating="🔥 INCREDIBLE! 3 touchdowns!";            rColor="#FFD700"; }
        else if (td == 2)         { rating="⭐ Outstanding — 2 touchdowns!";           rColor="#A71930"; }
        else if (td == 1)         { rating="👍 Solid — 1 TD scored!";                 rColor="#A71930"; }
        else                      { rating="😤 Held scoreless. Study the playbook!";  rColor="#A5ACAF"; }

        JOptionPane.showMessageDialog(null,
            "<html><body style='width:400px;background:#000;color:#fff;text-align:center;font-family:Arial,sans-serif;'>" +
            "<div style='background:#A71930;padding:14px;margin-bottom:12px;'>" +
            "<h2 style='color:#fff;margin:4px;'>🏟️ FALCONS OFFENSE — RESULTS</h2>" +
            "<p style='color:#A5ACAF;margin:4px;font-size:12px;'>" + player.name + " " + player.number + " | " + player.pos + "</p></div>" +
            "<div style='background:#1a1a1a;padding:12px;margin:8px 0;'>" +
            "<table style='width:100%;color:#fff;font-size:13px;'>" +
            "<tr><td style='text-align:center;padding:8px;'>" +
            "<b style='color:#A71930;font-size:12px;'>TOUCHDOWNS</b><br>" +
            "<span style='font-size:40px;font-weight:bold;'>" + td + "</span></td>" +
            "<td style='text-align:center;padding:8px;'>" +
            "<b style='color:#A71930;font-size:12px;'>TOTAL POINTS</b><br>" +
            "<span style='font-size:40px;font-weight:bold;'>" + totalScore[0] + "</span></td></tr>" +
            "</table></div>" +
            "<p style='font-size:14px;color:" + rColor + ";font-weight:bold;margin:10px;'>" + rating + "</p>" +
            "<div style='background:#1a1a1a;padding:8px;margin:8px 0;text-align:left;font-size:11px;'>" +
            "<b style='color:#FFD700;'>Your Player Stats:</b><br>" +
            "<span style='color:#A5ACAF;'>" +
            "Speed: " + player.speed + "/10 &nbsp;|&nbsp; Agility: " + player.agility + "/10 &nbsp;|&nbsp; " +
            "Strength: " + player.strength + "/10<br>" +
            "Catching: " + player.catching + "/10 &nbsp;|&nbsp; Awareness: " + player.awareness + "/10</span></div>" +
            "<div style='background:#A71930;padding:8px;margin-top:10px;'><b style='color:#fff;'>RISE UP! 🦅</b></div>" +
            "</body></html>",
            "Falcons Offense — Results", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void drawOffensePlayer(java.awt.Graphics2D g, int cx, int cy,
                                          java.awt.Color jersey, java.awt.Color txt,
                                          String label, boolean hasBall, boolean active) {
        final int R = 15;
        // Shadow
        g.setColor(new java.awt.Color(0,0,0,60));
        g.fillOval(cx-R+2, cy-R+5, R*2, R*2);
        // Body
        g.setColor(jersey);
        g.fillOval(cx-R, cy-R, R*2, R*2);
        // Active glow ring
        if (active) {
            g.setColor(new java.awt.Color(0xFF,0xD7,0x00,160));
            g.setStroke(new java.awt.BasicStroke(2.5f));
            g.drawOval(cx-R-2, cy-R-2, R*2+4, R*2+4);
        }
        // Helmet shine
        g.setColor(new java.awt.Color(255,255,255,65));
        g.fillOval(cx-R+3, cy-R+2, R-2, R-4);
        // Outline
        g.setColor(new java.awt.Color(255,255,255,120));
        g.setStroke(new java.awt.BasicStroke(1.5f));
        g.drawOval(cx-R, cy-R, R*2, R*2);
        // Jersey number / label
        g.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 8));
        g.setColor(txt);
        java.awt.FontMetrics fm2 = g.getFontMetrics();
        g.drawString(label, cx - fm2.stringWidth(label)/2, cy+3);
        // Ball
        if (hasBall) {
            g.setColor(new java.awt.Color(0xC4,0x7C,0x25));
            g.fillOval(cx+R-3, cy-R-3, 11, 8);
            g.setColor(java.awt.Color.WHITE);
            g.setStroke(new java.awt.BasicStroke(0.8f));
            g.drawLine(cx+R, cy-R, cx+R+6, cy-R+4);
        }
    }

}
