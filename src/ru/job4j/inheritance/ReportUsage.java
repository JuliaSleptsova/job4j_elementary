package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        HtmlReport reportHtml = new HtmlReport();
        String text1 = reportHtml.generate("Report's name", "Report's body");
        System.out.println(text1);
        JSONReport reportJson = new JSONReport();
        System.out.println(reportJson.generate("Report's name", "Report's body"));
    }
}
