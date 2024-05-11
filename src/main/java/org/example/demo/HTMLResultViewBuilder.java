package org.example.demo;

import java.util.List;
import java.util.Map;

public class HTMLResultViewBuilder {


    private final String HEADER = """
         <!DOCTYPE html>
         <html lang="en">
           <head>
             <meta charset="utf-8">
             <meta http-equiv="X-UA-Compatible" content="IE=edge">
             <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
             <link rel="icon" href="/favicon.ico">
             <head>
               <meta charset="UTF-8">
               <link rel="apple-touch-icon" type="image/png" href="https://cpwebassets.codepen.io/assets/favicon/apple-touch-icon-5ae1a0698dcc2402e9712f7d01ed509a57814f994c660df9f7a952f3060705ee.png">
               <meta name="apple-mobile-web-app-title" content="CodePen">
               <link rel="shortcut icon" type="image/x-icon" href="https://cpwebassets.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico">
               <link rel="mask-icon" type="image/x-icon" href="https://cpwebassets.codepen.io/assets/favicon/logo-pin-b4b4269c16397ad2f0f7a01bcdf513a1994f4c94b8af2f191c09eb0d601762b1.svg" color="#111">
               <link rel="canonical" href="https://codepen.io/pixelchar/pen/rNaKLM">
               <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js" type="text/javascript"></script>
               <meta name="viewport" content="width=device-width">
               <style media="" data-href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
                 button,
                 hr,
                 input {
                   overflow: visible
                 }
        
                 audio,
                 canvas,
                 progress,
                 video {
                   display: inline-block
                 }
        
                 progress,
                 sub,
                 sup {
                   vertical-align: baseline
                 }
        
                 html {
                   font-family: sans-serif;
                   line-height: 1.15;
                   -ms-text-size-adjust: 100%;
                   -webkit-text-size-adjust: 100%
                 }
        
                 body {
                   margin: 0
                 }
        
                 menu,
                 article,
                 aside,
                 details,
                 footer,
                 header,
                 nav,
                 section {
                   display: block
                 }
        
                 h1 {
                   font-size: 2em;
                   margin: .67em 0
                 }
        
                 figcaption,
                 figure,
                 main {
                   display: block
                 }
        
                 figure {
                   margin: 1em 40px
                 }
        
                 hr {
                   box-sizing: content-box;
                   height: 0
                 }
        
                 code,
                 kbd,
                 pre,
                 samp {
                   font-family: monospace, monospace;
                   font-size: 1em
                 }
        
                 a {
                   background-color: transparent;
                   -webkit-text-decoration-skip: objects
                 }
        
                 a:active,
                 a:hover {
                   outline-width: 0
                 }
        
                 abbr[title] {
                   border-bottom: none;
                   text-decoration: underline;
                   text-decoration: underline dotted
                 }
        
                 b,
                 strong {
                   font-weight: bolder
                 }
        
                 dfn {
                   font-style: italic
                 }
        
                 mark {
                   background-color: #ff0;
                   color: #000
                 }
        
                 small {
                   font-size: 80%
                 }
        
                 sub,
                 sup {
                   font-size: 75%;
                   line-height: 0;
                   position: relative
                 }
        
                 sub {
                   bottom: -.25em
                 }
        
                 sup {
                   top: -.5em
                 }
        
                 audio:not([controls]) {
                   display: none;
                   height: 0
                 }
        
                 img {
                   border-style: none
                 }
        
                 svg:not(:root) {
                   overflow: hidden
                 }
        
                 button,
                 input,
                 optgroup,
                 select,
                 textarea {
                   font-family: sans-serif;
                   font-size: 100%;
                   line-height: 1.15;
                   margin: 0
                 }
        
                 button,
                 input {}
        
                 button,
                 select {
                   text-transform: none
                 }
        
                 [type=submit],
                 [type=reset],
                 button,
                 html [type=button] {
                   -webkit-appearance: button
                 }
        
                 [type=button]::-moz-focus-inner,
                 [type=reset]::-moz-focus-inner,
                 [type=submit]::-moz-focus-inner,
                 button::-moz-focus-inner {
                   border-style: none;
                   padding: 0
                 }
        
                 [type=button]:-moz-focusring,
                 [type=reset]:-moz-focusring,
                 [type=submit]:-moz-focusring,
                 button:-moz-focusring {
                   outline: ButtonText dotted 1px
                 }
        
                 fieldset {
                   border: 1px solid silver;
                   margin: 0 2px;
                   padding: .35em .625em .75em
                 }
        
                 legend {
                   box-sizing: border-box;
                   color: inherit;
                   display: table;
                   max-width: 100%;
                   padding: 0;
                   white-space: normal
                 }
        
                 progress {}
        
                 textarea {
                   overflow: auto
                 }
        
                 [type=checkbox],
                 [type=radio] {
                   box-sizing: border-box;
                   padding: 0
                 }
        
                 [type=number]::-webkit-inner-spin-button,
                 [type=number]::-webkit-outer-spin-button {
                   height: auto
                 }
        
                 [type=search] {
                   -webkit-appearance: textfield;
                   outline-offset: -2px
                 }
        
                 [type=search]::-webkit-search-cancel-button,
                 [type=search]::-webkit-search-decoration {
                   -webkit-appearance: none
                 }
        
                 ::-webkit-file-upload-button {
                   -webkit-appearance: button;
                   font: inherit
                 }
        
                 summary {
                   display: list-item
                 }
        
                 [hidden],
                 template {
                   display: none
                 }
        
                 /*# sourceMappingURL=normalize.min.css.map */
               </style>
               <style>
                 html {
                   box-sizing: border-box;
                 }
        
                 *,
                 *:before,
                 *:after {
                   box-sizing: inherit;
                 }
        
                 body {
                   font-family: system-ui, -apple-system, BlinkMacSystemFont, "Avenir Next", "Avenir", "Segoe UI", "Lucida Grande", "Helvetica Neue", "Helvetica", "Fira Sans", "Roboto", "Noto", "Droid Sans", "Cantarell", "Oxygen", "Ubuntu", "Franklin Gothic Medium", "Century Gothic", "Liberation Sans", sans-serif;
                   color: rgba(0, 0, 0, 0.87);
                 }
        
                 a {
                   color: #26890d;
                 }
        
                 a:hover,
                 a:focus {
                   color: #046a38;
                 }
        
                 .container {
                   margin: 5% 3%;
                 }
        
                 @media (min-width: 48em) {
                   .container {
                     margin: 2%;
                   }
                 }
        
                 @media (min-width: 75em) {
                   .container {
                     margin: 2em auto;
                     max-width: 75em;
                   }
                 }
        
                 .responsive-table {
                   width: 100%;
                   margin-bottom: 1.5em;
                   border-spacing: 0;
                 }
        
                 @media (min-width: 48em) {
                   .responsive-table {
                     font-size: 0.9em;
                   }
                 }
        
                 @media (min-width: 62em) {
                   .responsive-table {
                     font-size: 1em;
                   }
                 }
        
                 .responsive-table thead {
                   position: absolute;
                   clip: rect(1px 1px 1px 1px);
                   /* IE6, IE7 */
                   padding: 0;
                   border: 0;
                   height: 1px;
                   width: 1px;
                   overflow: hidden;
                 }
        
                 @media (min-width: 48em) {
                   .responsive-table thead {
                     position: relative;
                     clip: auto;
                     height: auto;
                     width: auto;
                     overflow: auto;
                   }
                 }
        
                 .responsive-table thead th {
                   background-color: #26890d;
                   border: 1px solid #86bc25;
                   font-weight: normal;
                   text-align: center;
                   color: white;
                 }
        
                 .responsive-table thead th:first-of-type {
                   text-align: left;
                 }
        
                 .responsive-table tbody,
                 .responsive-table tr,
                 .responsive-table th,
                 .responsive-table td {
                   display: block;
                   padding: 0;
                   text-align: left;
                   white-space: normal;
                 }
        
                 @media (min-width: 48em) {
                   .responsive-table tr {
                     display: table-row;
                   }
                 }
        
                 .responsive-table th,
                 .responsive-table td {
                   padding: 0.5em;
                   vertical-align: middle;
                 }
        
                 @media (min-width: 30em) {
        
                   .responsive-table th,
                   .responsive-table td {
                     padding: 0.75em 0.5em;
                   }
                 }
        
                 @media (min-width: 48em) {
        
                   .responsive-table th,
                   .responsive-table td {
                     display: table-cell;
                     padding: 0.5em;
                   }
                 }
        
                 @media (min-width: 62em) {
        
                   .responsive-table th,
                   .responsive-table td {
                     padding: 0.75em 0.5em;
                   }
                 }
        
                 @media (min-width: 75em) {
        
                   .responsive-table th,
                   .responsive-table td {
                     padding: 0.75em;
                   }
                 }
        
                 .responsive-table caption {
                   margin-bottom: 1em;
                   font-size: 1em;
                   font-weight: bold;
                   text-align: center;
                 }
        
                 @media (min-width: 48em) {
                   .responsive-table caption {
                     font-size: 1.5em;
                   }
                 }
        
                 .responsive-table tfoot {
                   font-size: 0.8em;
                   font-style: italic;
                 }
        
                 @media (min-width: 62em) {
                   .responsive-table tfoot {
                     font-size: 0.9em;
                   }
                 }
        
                 @media (min-width: 48em) {
                   .responsive-table tbody {
                     display: table-row-group;
                   }
                 }
        
                 .responsive-table tbody tr {
                   margin-bottom: 1em;
                 }
        
                 @media (min-width: 48em) {
                   .responsive-table tbody tr {
                     display: table-row;
                     border-width: 1px;
                   }
                 }
        
                 .responsive-table tbody tr:last-of-type {
                   margin-bottom: 0;
                 }
        
                 @media (min-width: 48em) {
                   .responsive-table tbody tr:nth-of-type(even) {
                     background-color: rgba(0, 0, 0, 0.12);
                   }
                 }
        
                 .responsive-table tbody th[scope=row] {
                   background-color: #26890d;
                   color: white;
                 }
        
                 @media (min-width: 30em) {
                   .responsive-table tbody th[scope=row] {
                     border-left: 1px solid #86bc25;
                     border-bottom: 1px solid #86bc25;
                   }
                 }
        
                 @media (min-width: 48em) {
                   .responsive-table tbody th[scope=row] {
                     background-color: transparent;
                     color: #000001;
                     text-align: left;
                   }
                 }
        
                 .responsive-table tbody td {
                   text-align: right;
                 }
        
                 @media (min-width: 48em) {
                   .responsive-table tbody td {
                     border-left: 1px solid #86bc25;
                     border-bottom: 1px solid #86bc25;
                     text-align: center;
                   }
                 }
        
                 @media (min-width: 48em) {
                   .responsive-table tbody td:last-of-type {
                     border-right: 1px solid #86bc25;
                   }
                 }
        
                 .responsive-table tbody td[data-type=currency] {
                   text-align: right;
                 }
        
                 .responsive-table tbody td[data-title]:before {
                   content: attr(data-title);
                   float: left;
                   font-size: 0.8em;
                   color: rgba(0, 0, 0, 0.54);
                 }
        
                 @media (min-width: 30em) {
                   .responsive-table tbody td[data-title]:before {
                     font-size: 0.9em;
                   }
                 }
        
                 @media (min-width: 48em) {
                   .responsive-table tbody td[data-title]:before {
                     content: none;
                   }
                 }
               </style>
               <script>
                 window.console = window.console || function(t) {};
               </script>
               <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>
             </head>
           <body>
             <table class="responsive-table">
        """;

    private String tableBody = "";

    private final String FOOTER = """
                <table>
                </body>
                </html>
            """;

    private String tableHeader = "";

    private HTMLResultViewBuilder() {

    }

   public static HTMLResultViewBuilder newBuilder(){
        return new HTMLResultViewBuilder();
   }

   public HTMLResultViewBuilder setHeader(List<Object> headers){
        String tableHeaderH = """
                <thead>
                    <tr>
                """;

        String tableHeaderF = """
                    </tr>
                </thead>
                """;
        StringBuilder tableRow = new StringBuilder();
       for (Object header : headers) {
           tableRow.append("<th scope='col'>").append((String) header).append("</th>");
       }
       this.tableHeader = tableHeaderH + tableRow + tableHeaderF;
       return this;
   }

   public HTMLResultViewBuilder addRow(Map<Object, Object> row){
       StringBuilder body = new StringBuilder("<tr>");

        for(Map.Entry<Object, Object> entry : row.entrySet()){
            body.append("<td>").append(((Map<?, ?>) (entry.getValue())).get("value")).append("</td>");
        }
       body.append("</tr>");

        tableBody += body;
        return this;
   }

   public String build(){
        return HEADER + tableHeader + tableBody + FOOTER;
   }

   public void reset(){
       tableHeader = "";
       tableBody = "";
   }

}
