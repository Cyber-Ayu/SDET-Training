# Apache JMeter Dashboard

## HTML Structure

### Head Section
- **Meta Tags**
  - Charset: UTF-8
  - Compatibility: IE=edge
  - Viewport: Responsive design
- **Title**
  - Apache JMeter Dashboard
- **Stylesheets**
  - Bootstrap Core CSS
  - MetisMenu CSS
  - Custom Dashboard CSS
  - Table Sorter CSS
  - Font Awesome for icons
  - Dashboard-specific styles

---

### Body Section
#### Navbar
- **Brand**: Apache JMeter Dashboard
- **Navigation**
  - **Dashboard**: Links to `index.html`
  - **Charts**
    - Over Time
    - Throughput
    - Response Times
  - **Custom Graphs**
    - Over Time (Custom Graphs)

---

#### Page Wrapper
##### Panels
1. **Test and Report Information**
   - **Details Table**
     - Source File: `results.jtl`
     - Start Time: `1/23/25, 1:28 PM`
     - End Time: `1/23/25, 1:28 PM`

2. **APDEX (Application Performance Index)**
   - Link to [Apdex on Wikipedia](https://en.wikipedia.org/wiki/Apdex)
   - Table placeholder for Apdex data.

3. **Requests Summary**
   - Flot chart placeholder.

4. **Statistics**
   - Table placeholder for statistical data.

5. **Errors**
   - Table placeholder for error details.

6. **Top 5 Errors by Sampler**
   - Table placeholder for error data by sampler.

---

### Scripts
#### Libraries and Frameworks
- jQuery
- Bootstrap
- Flot Chart Plugins
  - Core, Pie, Resize, Time, Tooltip, Axis Labels
- MetisMenu Plugin
- Table Sorter Plugin

#### Custom Scripts
- Dashboard Common Scripts
- Dashboard-specific functionality
- Custom Theme JavaScript

---

## Notes
This dashboard is designed for Apache JMeter reports, integrating responsive components and charts using Flot and Bootstrap. It provides detailed sections for test information, performance index (APDEX), request summaries, statistics, and error analysis.

### Features
- Dynamic navigation with a sidebar.
- Chart placeholders for Flot graphs.
- Responsive tables for displaying test and error data.
- Custom styles and scripts for enhanced usability.
