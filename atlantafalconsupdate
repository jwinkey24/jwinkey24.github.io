import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class AtlantaFalconsInfo {
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
            "✓ Interactive 20-Question Quiz</p>" +
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
        String business = "<html><body style='width: 600px; background-color: #000000; color: #FFFFFF; font-family: Arial, sans-serif;'>" +
            "<div style='text-align: center; background-color: #A71930; padding: 10px; margin-bottom: 15px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>BUSINESS & PARTNERSHIPS</h2>" +
            "</div>" +
            "<div style='background-color: #1a1a1a; padding: 12px; border-left: 4px solid #A71930; margin-bottom: 15px;'>" +
            "<h3 style='color: #A71930; margin-top: 0;'>AMB SPORTS & ENTERTAINMENT</h3>" +
            "<p style='color: #A5ACAF; margin: 5px 0;'>Parent company that operates:</p>" +
            "<ul style='color: #FFFFFF; margin: 10px 0;'>" +
            "<li>Atlanta Falcons (NFL)</li>" +
            "<li>Atlanta United FC (MLS)</li>" +
            "<li>Mercedes-Benz Stadium</li>" +
            "<li>PGA TOUR Superstore</li>" +
            "<li>Mountain Sky Guest Ranch</li>" +
            "</ul>" +
            "</div>" +
            "<hr style='border: 1px solid #A71930;'>" +
            "<h3 style='color: #A71930; text-align: center; margin: 15px 0;'>MAJOR PARTNERSHIPS & SPONSORS</h3>" +
            "<div style='background-color: #1a1a1a; padding: 10px; margin-bottom: 10px;'>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr>" +
            "<td style='width: 50%; padding: 8px; vertical-align: top;'>" +
            "<h4 style='color: #A71930; margin: 5px 0;'>Stadium Naming Rights</h4>" +
            "<p style='margin: 5px 0;'>• Mercedes-Benz<br><span style='color: #A5ACAF; font-size: 12px;'>Long-term partnership</span></p>" +
            "</td>" +
            "<td style='width: 50%; padding: 8px; vertical-align: top;'>" +
            "<h4 style='color: #A71930; margin: 5px 0;'>Jersey Sponsor</h4>" +
            "<p style='margin: 5px 0;'>• Worldpay<br><span style='color: #A5ACAF; font-size: 12px;'>Jersey patch sponsor</span></p>" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "</div>" +
            "<div style='background-color: #1a1a1a; padding: 12px;'>" +
            "<h4 style='color: #A71930; margin: 5px 0 10px 0;'>Official Partners</h4>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr>" +
            "<td style='width: 50%; padding: 5px;'>• Coca-Cola<br><span style='color: #A5ACAF; font-size: 11px;'>Atlanta-based, founding</span></td>" +
            "<td style='width: 50%; padding: 5px;'>• The Home Depot<br><span style='color: #A5ACAF; font-size: 11px;'>Blank connection</span></td>" +
            "</tr>" +
            "<tr>" +
            "<td style='padding: 5px;'>• Delta Air Lines<br><span style='color: #A5ACAF; font-size: 11px;'>Atlanta-based</span></td>" +
            "<td style='padding: 5px;'>• Chick-fil-A<br><span style='color: #A5ACAF; font-size: 11px;'>Georgia-based</span></td>" +
            "</tr>" +
            "<tr>" +
            "<td style='padding: 5px;'>• IBM</td>" +
            "<td style='padding: 5px;'>• Anheuser-Busch</td>" +
            "</tr>" +
            "<tr>" +
            "<td style='padding: 5px;'>• Pepsi<br><span style='color: #A5ACAF; font-size: 11px;'>Beverage partner</span></td>" +
            "<td style='padding: 5px;'></td>" +
            "</tr>" +
            "</table>" +
            "</div>" +
            "<hr style='border: 1px solid #A71930; margin: 15px 0;'>" +
            "<h3 style='color: #A71930; text-align: center;'>INNOVATIVE BUSINESS PRACTICES</h3>" +
            "<div style='background-color: #1a1a1a; padding: 12px; margin-top: 10px;'>" +
            "<table style='width: 100%; color: #FFFFFF;'>" +
            "<tr>" +
            "<td style='width: 50%; padding: 8px; vertical-align: top;'>" +
            "<b style='color: #A71930;'>Fan-First Pricing</b><br>" +
            "<span style='font-size: 13px;'>Street-level prices<br>$2 hot dogs, $2 sodas</span>" +
            "</td>" +
            "<td style='width: 50%; padding: 8px; vertical-align: top;'>" +
            "<b style='color: #A71930;'>Technology</b><br>" +
            "<span style='font-size: 13px;'>Cashless payments<br>Mobile ticketing</span>" +
            "</td>" +
            "</tr>" +
            "<tr>" +
            "<td style='padding: 8px; vertical-align: top;'>" +
            "<b style='color: #A71930;'>Community</b><br>" +
            "<span style='font-size: 13px;'>Arthur Blank Family<br>Foundation</span>" +
            "</td>" +
            "<td style='padding: 8px; vertical-align: top;'>" +
            "<b style='color: #A71930;'>Sustainability</b><br>" +
            "<span style='font-size: 13px;'>LEED Platinum<br>certified stadium</span>" +
            "</td>" +
            "</tr>" +
            "</table>" +
            "<hr style='border: 1px solid #A5ACAF; margin: 12px 0;'>" +
            "<p style='color: #A71930; font-weight: bold; margin: 8px 0;'>Economic Impact:</p>" +
            "<p style='color: #FFFFFF; font-size: 13px; margin: 5px 0;'>" +
            "• 100+ events annually<br>" +
            "• Significant Atlanta revenue<br>" +
            "• Major metro employer</p>" +
            "</div>" +
            "<div style='text-align: center; margin-top: 15px; padding: 10px; background-color: #A71930;'>" +
            "<b style='color: #FFFFFF; font-size: 16px;'>RISE UP! 🦅</b>" +
            "</div>" +
            "</body></html>";
        
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
            "<p style='color: #A5ACAF; margin-top: 10px; font-size: 12px;'>" +
            "You can skip any question or exit the quiz at any time.</p>" +
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
        int questionsAnswered = 0;
        
        // Question 1: Team History
        String[] q1Options = {"1965", "1966", "1967", "1970", "Skip Question", "Exit Quiz"};
        int q1Answer = JOptionPane.showOptionDialog(null,
            "Question 1 of 10:\nWhat year was the Atlanta Falcons franchise founded?",
            "Quiz Question 1/10",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            q1Options,
            q1Options[0]);
        
        if (q1Answer == 5 || q1Answer == -1) { // Exit Quiz or window closed
            showQuizExitMessage(score, questionsAnswered);
            return;
        } else if (q1Answer == 4) { // Skip Question
            // Do nothing, continue to next question
        } else {
            questionsAnswered++;
            if (q1Answer == 1) { // 1966 is correct
                score++;
                JOptionPane.showMessageDialog(null, 
                    "<html><body style='text-align: center;'><p style='color: green; font-size: 16px;'>✓ Correct!</p></body></html>", 
                    "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, 
                    "<html><body style='text-align: center;'><p style='color: red; font-size: 14px;'>✗ Incorrect.</p>" +
                    "<p>The correct answer is <b>1966</b>.</p></body></html>", 
                    "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        // Question 2: Owner
        String[] q2Options = {"Jerry Jones", "Arthur Blank", "Robert Kraft", "Stan Kroenke"};
        int q2Answer = JOptionPane.showOptionDialog(null,
            "Question 2: Who is the current owner of the Atlanta Falcons?",
            "Quiz Question 2/20",
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
            "Quiz Question 3/20",
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
            "Quiz Question 4/20",
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
            "Quiz Question 5/20",
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
            "Quiz Question 6/20",
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
            "Quiz Question 7/20",
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
            "Quiz Question 8/20",
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
            "Quiz Question 9/20",
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
            "Quiz Question 10/20",
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
        double percentage = questionsAnswered > 0 ? (score * 100.0) / questionsAnswered : 0;
        String grade;
        String gradeColor;
        String message;
        
        if (percentage >= 90) {
            grade = "A - Outstanding!";
            gradeColor = "#00FF00";
            message = "🏆 Excellent! You're a true Falcons expert!";
        } else if (percentage >= 80) {
            grade = "B - Great Job!";
            gradeColor = "#7FFF00";
            message = "👏 Great work! You know your Falcons history!";
        } else if (percentage >= 70) {
            grade = "C - Good Effort!";
            gradeColor = "#FFD700";
            message = "👍 Good job! Keep learning about the Falcons!";
        } else if (percentage >= 60) {
            grade = "D - Keep Studying!";
            gradeColor = "#FFA500";
            message = "📚 Not bad! Review the information and try again!";
        } else {
            grade = "F - Need More Study";
            gradeColor = "#FF4500";
            message = "📖 Keep reading! Explore the other sections to learn more!";
        }
        
        JOptionPane.showMessageDialog(null,
            "<html><body style='width: 400px; background-color: #000000; color: #FFFFFF; text-align: center;'>" +
            "<div style='background-color: #A71930; padding: 12px; margin-bottom: 15px;'>" +
            "<h2 style='color: #FFFFFF; margin: 5px;'>QUIZ COMPLETE!</h2>" +
            "</div>" +
            "<div style='background-color: #1a1a1a; padding: 15px; border: 2px solid #A71930; margin-bottom: 15px;'>" +
            "<p style='color: #FFFFFF; font-size: 18px; margin: 8px 0;'>Your Score</p>" +
            "<p style='color: #A71930; font-size: 32px; font-weight: bold; margin: 10px 0;'>" + 
            score + " / " + questionsAnswered + "</p>" +
            "<p style='color: #A5ACAF; font-size: 16px; margin: 8px 0;'>" + 
            String.format("%.1f", percentage) + "%</p>" +
            "<hr style='border: 1px solid #A71930; margin: 15px 0;'>" +
            "<p style='color: " + gradeColor + "; font-size: 20px; font-weight: bold; margin: 10px 0;'>Grade: " + grade + "</p>" +
            "</div>" +
            "<p style='color: #FFFFFF; font-size: 14px; margin: 15px 10px;'>" + message + "</p>" +
            "<div style='margin-top: 15px; padding: 10px; background-color: #A71930;'>" +
            "<b style='color: #FFFFFF; font-size: 16px;'>RISE UP! 🦅</b>" +
            "</div>" +
            "</body></html>",
            "Quiz Results",
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void showQuizExitMessage(int score, int questionsAnswered) {
        String message;
        if (questionsAnswered == 0) {
            message = "<html><body style='width: 350px; background-color: #000000; color: #FFFFFF; text-align: center;'>" +
                "<div style='background-color: #A71930; padding: 10px; margin-bottom: 10px;'>" +
                "<h3 style='color: #FFFFFF; margin: 5px;'>Quiz Exited</h3>" +
                "</div>" +
                "<p style='color: #FFFFFF;'>You didn't answer any questions.</p>" +
                "<p style='color: #A5ACAF; margin-top: 10px;'>Come back anytime to test your knowledge!</p>" +
                "<div style='margin-top: 10px; padding: 8px; background-color: #A71930;'>" +
                "<b style='color: #FFFFFF;'>RISE UP! 🦅</b>" +
                "</div>" +
                "</body></html>";
        } else {
            double percentage = (double) score / questionsAnswered * 100;
            message = "<html><body style='width: 350px; background-color: #000000; color: #FFFFFF; text-align: center;'>" +
                "<div style='background-color: #A71930; padding: 10px; margin-bottom: 10px;'>" +
                "<h3 style='color: #FFFFFF; margin: 5px;'>Quiz Exited</h3>" +
                "</div>" +
                "<p style='color: #FFFFFF; font-size: 16px;'>Your Score: <b style='color: #A71930;'>" + score + 
                "/" + questionsAnswered + "</b></p>" +
                "<p style='color: #A5ACAF;'>(" + String.format("%.0f", percentage) + "%)</p>" +
                "<p style='color: #FFFFFF; margin-top: 10px;'>Thanks for playing!</p>" +
                "<div style='margin-top: 10px; padding: 8px; background-color: #A71930;'>" +
                "<b style='color: #FFFFFF;'>RISE UP! 🦅</b>" +
                "</div>" +
                "</body></html>";
        }
        JOptionPane.showMessageDialog(null, message, "Quiz Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
