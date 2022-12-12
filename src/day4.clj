(ns aoc.day4
  (:require [clojure.string :as str]))

; Day 4 / #1 =====================================================================================================================

(def pairs (str/split-lines "8-13,10-65\n13-23,14-24\n72-83,73-76\n37-37,39-73\n64-94,65-65\n2-2,10-65\n53-57,24-54\n34-87,34-88\n4-95,3-96\n69-69,68-68\n2-2,1-66\n17-78,16-78\n50-59,30-58\n29-84,29-85\n82-91,81-82\n50-55,41-48\n1-89,7-88\n11-80,11-79\n81-83,61-83\n68-71,68-70\n42-83,23-83\n78-86,78-86\n5-85,2-5\n47-65,7-47\n8-99,8-98\n7-64,7-79\n1-3,3-79\n10-18,10-19\n49-69,69-78\n1-98,2-98\n11-19,10-99\n6-97,5-98\n73-74,32-73\n96-97,1-97\n4-6,8-88\n23-28,21-29\n26-36,21-25\n59-77,58-93\n29-74,30-73\n1-85,85-99\n47-48,47-85\n42-51,17-52\n43-44,44-44\n5-30,38-66\n47-61,62-73\n27-52,26-51\n11-96,95-99\n74-82,73-82\n8-8,7-93\n81-81,14-81\n25-77,26-76\n21-81,22-80\n2-94,3-94\n16-91,17-90\n95-96,3-96\n25-28,36-97\n28-90,28-90\n10-88,5-89\n45-47,4-45\n6-58,9-62\n97-98,32-96\n79-85,60-85\n32-96,5-8\n12-64,12-12\n72-85,37-72\n5-98,4-6\n95-96,3-95\n49-82,1-82\n31-49,31-50\n58-65,56-57\n37-58,8-37\n10-29,9-96\n85-92,79-85\n71-84,40-84\n37-50,36-51\n37-52,37-52\n21-98,20-85\n4-99,4-98\n78-84,77-99\n16-50,50-90\n4-34,35-42\n75-79,13-76\n45-55,49-84\n76-97,1-77\n17-45,9-16\n1-9,1-4\n13-35,13-35\n4-68,68-76\n14-76,21-76\n58-71,58-72\n12-34,34-35\n35-93,35-94\n18-36,10-36\n10-88,11-77\n8-86,8-85\n10-33,34-34\n1-97,3-96\n50-92,1-49\n2-4,4-99\n2-88,54-88\n1-95,2-78\n3-50,2-69\n44-48,43-99\n7-78,2-2\n74-74,3-73\n70-71,45-70\n13-97,8-14\n56-75,57-57\n5-93,5-83\n47-48,46-49\n73-80,73-80\n4-47,5-47\n69-94,68-93\n15-84,16-84\n63-64,9-64\n69-79,60-68\n32-79,5-78\n54-99,55-92\n40-41,40-75\n30-97,97-99\n28-28,28-98\n4-81,23-80\n28-45,29-94\n20-21,21-53\n52-52,27-51\n88-94,47-95\n88-89,33-89\n15-62,16-66\n1-24,23-32\n4-31,6-92\n7-13,14-99\n6-61,7-61\n26-51,24-51\n6-52,25-51\n29-49,49-50\n36-36,37-69\n7-95,94-95\n17-81,80-98\n11-63,63-63\n13-84,14-46\n26-32,12-26\n60-85,61-63\n65-71,39-68\n44-94,44-88\n64-84,84-97\n12-92,13-92\n49-89,50-50\n54-98,98-99\n20-88,15-87\n39-64,47-63\n4-79,3-80\n1-18,1-18\n17-49,16-49\n40-70,39-99\n46-48,13-47\n21-88,22-98\n6-94,1-5\n63-97,96-99\n13-58,11-13\n3-95,3-96\n19-85,18-88\n42-52,42-53\n2-63,63-96\n4-93,35-92\n9-89,89-92\n3-61,3-61\n6-93,5-94\n14-98,14-98\n4-99,3-5\n27-28,28-55\n22-92,91-99\n2-56,55-56\n22-22,21-22\n82-95,23-96\n31-32,31-62\n29-54,29-62\n12-98,16-95\n73-90,31-73\n20-83,17-83\n4-93,5-94\n5-41,39-69\n7-51,6-26\n83-95,83-94\n23-91,24-92\n31-39,7-30\n10-10,9-87\n52-60,59-94\n6-92,5-88\n58-74,56-57\n21-98,22-99\n91-98,31-92\n87-87,22-58\n34-45,34-44\n29-96,28-95\n54-97,16-55\n9-78,1-8\n19-96,96-99\n15-94,94-94\n31-80,28-42\n2-44,4-98\n29-29,31-80\n15-96,15-96\n2-72,72-73\n6-98,98-98\n14-76,46-77\n22-90,22-69\n38-94,93-94\n24-78,23-78\n59-97,71-98\n3-17,18-70\n62-98,63-98\n75-76,12-76\n16-71,17-70\n16-17,16-17\n23-69,24-68\n64-76,3-65\n1-20,20-84\n23-23,22-66\n12-58,32-82\n89-95,23-88\n15-74,16-75\n36-37,7-36\n93-93,17-92\n19-49,18-48\n35-38,34-54\n22-33,11-22\n53-98,52-97\n23-65,23-96\n70-93,56-69\n40-84,40-84\n9-91,10-90\n16-89,16-89\n27-74,73-96\n3-98,4-95\n20-73,20-73\n71-97,20-98\n15-40,16-16\n8-85,84-93\n37-38,38-38\n14-25,14-24\n9-56,8-56\n6-68,6-69\n33-78,5-45\n83-83,16-83\n56-97,56-98\n82-97,2-98\n3-35,24-95\n3-33,4-34\n54-93,55-92\n7-92,29-91\n39-79,40-78\n16-69,16-69\n5-23,5-69\n88-98,30-88\n80-81,81-97\n92-96,30-93\n17-90,17-90\n11-12,11-28\n3-99,3-99\n10-55,53-75\n18-64,17-78\n31-56,56-57\n41-72,40-72\n4-98,3-97\n10-99,2-10\n53-71,71-72\n9-88,7-85\n41-92,42-42\n15-51,14-50\n34-63,33-90\n6-7,9-63\n44-84,31-45\n14-92,81-92\n32-87,32-87\n4-4,7-65\n21-22,22-42\n9-28,13-27\n1-69,2-69\n10-38,11-38\n22-78,5-79\n15-93,16-95\n11-77,4-10\n96-97,16-97\n48-54,47-55\n51-59,40-59\n13-53,13-53\n34-54,53-95\n67-98,97-97\n30-96,31-96\n11-98,10-99\n52-90,53-91\n2-4,3-71\n48-99,48-94\n14-96,15-95\n94-99,11-95\n53-91,54-91\n20-58,58-58\n6-88,87-91\n49-72,25-73\n18-90,8-44\n17-95,92-95\n7-68,22-66\n22-57,22-56\n40-40,39-52\n9-80,8-79\n19-94,20-95\n26-90,25-55\n38-38,37-99\n1-97,2-97\n40-67,41-67\n5-91,91-95\n2-79,79-80\n93-98,4-94\n4-14,15-15\n66-77,42-66\n35-71,53-73\n79-88,7-78\n4-85,5-86\n3-59,2-58\n54-90,19-91\n11-13,12-99\n18-51,50-99\n44-88,88-97\n8-93,7-97\n8-32,7-51\n4-67,50-66\n10-15,15-79\n3-58,5-58\n85-99,72-97\n17-98,17-98\n15-54,16-43\n49-58,37-50\n3-40,40-41\n17-30,30-30\n2-99,4-99\n12-74,4-11\n13-83,84-93\n43-87,76-88\n32-92,31-92\n86-94,2-87\n42-53,53-84\n7-91,8-91\n3-73,54-78\n2-14,16-84\n2-52,1-96\n57-76,56-76\n88-89,8-89\n8-88,7-88\n19-87,11-87\n50-92,50-96\n36-46,36-46\n48-79,48-78\n28-69,13-20\n3-8,7-91\n30-32,31-47\n32-80,33-50\n39-64,40-63\n18-94,7-19\n9-30,8-31\n33-87,34-39\n43-84,83-85\n23-70,22-69\n13-80,12-80\n15-51,14-53\n2-59,2-60\n12-94,11-75\n34-62,35-62\n12-14,13-31\n17-21,21-83\n17-27,27-68\n65-83,66-82\n22-36,23-34\n44-82,23-45\n13-32,3-15\n39-50,40-50\n2-4,3-82\n17-51,16-50\n53-69,52-78\n19-27,18-77\n59-86,2-96\n67-67,15-63\n29-29,28-61\n13-98,12-98\n39-86,39-87\n14-39,13-34\n21-63,22-64\n16-27,45-65\n28-97,27-57\n11-87,10-60\n13-57,57-57\n2-8,1-9\n1-95,2-95\n16-16,15-98\n49-76,76-88\n42-71,41-72\n45-89,19-46\n8-88,3-9\n11-84,10-85\n4-86,6-98\n52-72,51-52\n12-12,11-22\n12-97,13-96\n3-86,87-87\n1-30,3-98\n29-56,30-57\n12-97,12-93\n10-84,84-84\n39-74,39-86\n37-99,25-99\n70-90,69-91\n30-68,29-99\n6-31,70-89\n13-76,10-13\n9-73,19-62\n96-98,37-96\n11-87,11-87\n50-83,50-85\n20-74,74-74\n47-90,46-85\n67-73,68-82\n1-80,81-81\n3-34,34-38\n2-2,1-84\n42-46,43-46\n12-93,12-94\n10-39,40-98\n5-77,40-84\n2-97,3-97\n6-45,3-46\n38-40,39-66\n53-67,52-68\n39-39,38-69\n3-55,2-71\n6-74,74-74\n12-97,12-75\n24-55,25-56\n6-6,5-22\n24-87,73-86\n14-84,15-83\n16-87,88-91\n89-90,66-89\n7-25,26-65\n15-31,32-97\n52-79,53-82\n50-89,49-51\n71-72,15-72\n3-5,4-74\n14-92,15-93\n29-42,42-79\n21-63,21-64\n6-23,5-86\n8-99,9-97\n3-61,3-62\n98-98,18-99\n10-40,9-39\n61-75,62-62\n12-98,46-98\n15-68,16-69\n27-94,26-93\n3-8,8-71\n10-63,62-87\n14-14,13-72\n47-76,47-76\n36-72,15-47\n9-97,11-96\n80-81,42-81\n32-89,1-73\n1-5,4-95\n3-9,9-85\n1-64,4-64\n42-60,42-60\n89-94,88-89\n27-83,28-84\n34-75,35-35\n73-98,43-74\n41-63,64-96\n47-92,20-29\n19-97,18-20\n63-87,64-76\n7-99,5-79\n5-7,6-67\n98-99,5-99\n71-83,71-84\n69-91,69-91\n33-33,32-97\n78-78,23-78\n74-99,54-87\n2-99,3-99\n13-64,14-65\n14-76,2-13\n53-89,53-89\n3-86,5-74\n30-98,29-30\n93-94,27-94\n1-59,58-59\n9-36,9-47\n2-99,75-98\n57-65,57-66\n17-41,17-99\n16-71,21-93\n8-32,17-48\n78-78,1-77\n1-32,31-32\n2-96,1-96\n18-45,23-43\n3-90,4-90\n19-35,20-45\n29-76,75-93\n38-55,19-39\n26-85,26-86\n42-90,41-90\n2-72,72-93\n81-89,23-81\n8-72,7-9\n28-41,37-40\n28-56,29-55\n9-39,8-38\n56-59,58-87\n13-99,14-99\n44-90,43-91\n76-85,84-86\n95-99,15-99\n12-96,23-95\n45-48,48-48\n7-49,1-3\n36-76,35-50\n10-36,35-62\n86-92,10-87\n7-85,7-85\n50-50,49-50\n2-97,96-97\n23-42,43-87\n98-99,55-99\n6-96,7-58\n15-68,68-95\n48-66,47-66\n24-30,23-31\n32-63,9-23\n28-55,54-56\n66-78,67-79\n14-95,14-95\n3-57,9-57\n88-90,87-98\n53-98,52-54\n8-99,4-9\n23-79,23-80\n12-86,11-87\n56-62,56-63\n8-88,52-87\n58-92,59-75\n46-72,71-72\n1-10,9-95\n58-58,20-59\n12-99,11-98\n36-61,61-68\n51-57,69-87\n4-99,5-83\n33-93,33-94\n12-35,29-34\n23-46,24-46\n81-96,81-95\n24-39,40-86\n2-6,28-93\n7-16,15-43\n10-65,2-66\n9-27,10-28\n47-71,55-61\n12-65,13-64\n93-94,19-93\n14-92,10-11\n8-70,9-69\n4-98,3-98\n21-79,22-79\n14-94,15-84\n13-45,14-45\n45-73,46-72\n18-32,17-31\n26-26,26-26\n12-88,11-13\n15-38,12-15\n19-19,18-90\n38-98,39-93\n20-22,19-68\n4-76,3-76\n58-97,99-99\n78-91,1-79\n8-8,8-43\n6-81,7-76\n15-95,16-94\n6-80,5-81\n16-50,15-16\n21-23,23-74\n20-92,91-92\n6-76,5-76\n33-73,73-97\n40-69,28-87\n8-26,25-98\n14-95,13-95\n15-15,14-52\n14-84,1-40\n2-97,3-3\n19-64,25-63\n4-54,5-54\n18-66,17-74\n76-78,76-79\n4-82,5-82\n6-12,12-93\n60-60,59-60\n23-67,23-68\n19-64,19-63\n53-75,48-70\n46-81,45-47\n1-21,1-2\n81-98,31-82\n41-74,40-73\n5-97,96-98\n7-84,6-83\n4-52,1-3\n51-66,64-81\n56-83,35-56\n55-68,48-56\n15-18,14-88\n14-93,14-94\n50-73,65-89\n3-93,2-79\n58-77,27-43\n3-51,4-52\n14-81,14-80\n2-58,14-90\n19-62,20-63\n1-6,5-21\n10-74,4-92\n38-44,39-44\n5-12,13-97\n39-70,32-69\n43-72,29-43\n42-42,43-50\n1-32,29-58\n22-67,21-70\n12-12,12-98\n58-90,42-56\n97-99,11-97\n78-78,38-78\n73-95,69-74\n92-97,55-93\n86-86,84-86\n25-25,24-25\n90-91,33-90\n2-93,3-93\n15-58,11-58\n41-95,94-99\n1-93,17-94\n22-64,22-64\n18-93,19-94\n25-95,24-26\n40-91,39-91\n18-46,17-45\n2-82,1-74\n24-41,23-24\n92-93,58-93\n37-46,38-46\n30-46,30-30\n2-17,9-96\n9-98,2-99\n92-92,11-92\n21-27,26-28\n4-79,5-79\n76-86,77-85\n9-96,2-96\n4-78,78-78\n12-97,12-99\n54-73,55-72\n68-81,21-67\n32-86,16-30\n62-95,61-96\n56-87,55-86\n96-97,26-96\n28-39,38-83\n18-64,64-82\n26-37,6-21\n41-76,40-89\n24-56,23-55\n49-96,97-99\n31-31,30-89\n15-17,11-18\n45-88,54-90\n5-39,13-97\n10-97,92-97\n24-73,46-63\n2-83,10-84\n13-73,12-72\n41-89,40-90\n15-91,90-94\n5-87,1-5\n16-19,17-18\n59-61,10-59\n84-89,27-83\n34-98,10-33\n45-93,45-94\n14-28,14-29\n3-88,87-87\n43-85,85-96\n4-96,1-4\n22-45,45-78\n82-82,27-83\n89-90,27-90\n15-94,93-94\n76-76,77-77\n97-99,2-98\n13-95,94-95\n8-11,7-40\n10-91,11-91\n11-60,60-60\n64-92,2-92\n75-90,65-75\n11-97,11-97\n4-4,5-96\n77-97,78-97\n32-86,20-86\n17-30,3-17\n11-87,11-87\n4-78,4-79\n10-72,73-73\n18-34,4-34\n17-56,16-18\n11-98,11-98\n19-88,18-87\n70-84,15-69\n1-67,2-67\n32-39,21-32\n64-97,28-64\n8-77,94-99\n6-12,12-98\n11-90,10-11\n45-45,44-45\n40-90,40-90\n3-91,2-4\n20-76,20-76\n29-30,30-33\n98-98,58-97\n51-98,50-99\n53-66,36-52\n65-91,65-92\n47-98,46-99\n35-56,36-40\n8-93,1-9\n60-62,31-61\n33-44,52-72\n76-95,94-95\n54-80,55-55\n1-98,2-98\n16-17,22-59\n18-89,19-90\n2-2,1-88\n5-62,5-62\n12-53,13-53\n22-42,21-75\n28-83,83-94\n3-96,4-98\n13-29,30-30\n3-96,1-96\n54-54,43-55\n14-29,29-30\n11-91,12-92\n9-89,8-88\n38-50,56-87\n10-14,19-79\n40-40,40-78\n18-52,17-60\n15-85,16-16\n4-90,4-91\n26-29,29-86\n97-99,68-96\n9-9,8-39\n41-51,33-33\n3-50,4-49\n1-98,1-98\n68-91,69-92\n66-80,67-78\n12-38,37-38\n58-80,31-58\n23-58,23-58\n4-6,5-67\n27-49,26-50\n84-84,33-84\n72-73,11-73\n34-82,22-26\n20-84,84-84\n27-72,71-84\n20-54,54-76\n16-73,13-45\n14-64,1-10\n33-80,32-55\n16-86,17-45\n17-17,16-74\n8-97,8-33\n27-43,28-44\n16-47,48-70\n54-83,53-55\n26-80,27-81\n17-40,16-75\n21-79,21-80\n2-26,3-27\n3-99,2-36\n1-77,77-87\n51-82,50-90\n4-71,18-70\n17-17,16-18\n68-68,67-84\n2-2,1-93\n2-92,9-91\n2-17,1-3\n2-98,7-97\n2-94,1-94\n8-10,9-99\n50-66,49-96\n30-54,53-72\n46-99,18-84\n6-58,1-45\n4-91,3-94\n12-27,13-28\n17-95,10-57\n16-63,16-63\n25-95,95-99\n66-90,67-82\n4-96,1-3\n50-50,1-49\n93-98,6-94\n5-82,5-82\n3-96,95-99\n7-33,6-32\n23-42,43-77\n23-51,51-66\n76-78,77-93\n14-87,87-88\n23-41,43-52\n88-88,60-87\n92-96,92-98\n14-87,14-93\n85-92,5-86\n2-99,1-98\n23-74,23-75\n60-82,60-82\n22-82,22-91\n82-97,58-82\n1-50,1-50\n27-50,26-51\n65-95,64-96\n17-68,4-16\n9-95,4-7\n21-91,73-92\n2-21,3-3\n16-16,15-17\n20-55,26-59\n17-99,18-58\n9-88,8-88\n3-53,4-23\n5-85,4-95\n10-90,59-90\n55-80,3-56\n25-74,26-73\n20-75,19-75\n22-53,21-47\n2-86,5-98\n11-76,11-76\n26-33,45-70\n20-57,21-21\n80-91,72-73\n21-79,20-96\n10-69,25-84\n32-99,81-99\n46-72,45-73\n24-24,23-71\n27-27,26-91\n6-37,6-36\n41-83,40-42\n8-26,1-5\n29-96,32-79\n57-88,58-87\n1-97,96-97\n28-80,2-28\n22-43,22-43\n28-68,12-33\n12-15,3-5\n8-63,7-92\n64-97,26-97\n78-84,82-83\n29-38,29-37\n18-57,19-41\n11-78,1-11\n11-61,10-60\n72-84,77-84\n55-69,51-54\n2-60,2-61\n36-75,5-76\n3-99,98-99\n1-99,1-99\n91-93,75-91\n8-54,6-8\n11-32,33-93\n44-87,1-87\n23-52,9-52\n42-75,10-69\n7-96,7-90\n22-90,22-89\n31-96,30-95\n30-68,31-68\n29-74,2-7\n66-79,65-80\n41-87,41-86\n19-99,22-89\n7-7,6-97\n73-73,72-73\n26-75,25-75\n9-30,15-38\n48-77,70-76\n81-91,64-91\n30-32,31-45\n40-73,40-59\n20-95,19-95\n55-86,38-54\n6-73,72-73\n4-94,5-93\n9-82,8-82\n14-81,13-81\n31-66,66-71\n35-44,35-44\n8-9,8-32\n37-73,74-87\n27-48,26-59\n11-40,12-41\n26-94,26-93\n64-93,65-92\n31-79,61-80\n3-5,4-97\n13-38,39-47\n92-98,4-93\n88-96,13-89\n11-52,10-53\n32-73,33-72\n16-18,18-18\n3-46,1-3\n1-75,76-81\n2-48,3-49\n40-43,43-61\n1-97,3-97\n7-96,7-96\n31-68,32-67\n40-40,41-56\n22-61,36-60\n5-89,89-96\n83-84,17-84\n16-35,34-59\n10-86,11-95\n97-98,1-97\n25-93,22-94\n47-99,47-90\n65-65,9-64\n2-43,8-74\n92-95,12-93\n57-92,58-91\n6-63,63-64\n44-63,45-62\n46-60,47-61\n41-47,6-56\n61-96,59-59\n90-91,23-90\n58-77,57-78\n3-50,3-51\n57-88,58-88\n3-5,4-83\n56-86,55-57\n10-43,23-29\n32-81,9-32\n12-76,76-77\n2-92,1-98\n18-90,89-89\n54-89,3-6\n7-96,8-95\n43-72,72-97\n3-84,4-83\n21-98,22-99\n15-18,10-19\n5-5,5-94\n24-93,25-93\n55-74,74-82\n22-92,23-93\n25-33,34-34\n3-20,2-30\n15-34,20-42\n16-61,60-61\n10-16,9-15\n43-81,10-86\n28-35,27-30\n20-60,19-72\n49-51,50-55\n7-20,20-60\n19-99,20-98\n83-97,45-82\n14-65,13-64"))

(defn get-edges [pair]
  (for [pair (str/split pair #",")]
    (for [part (str/split pair #"-")]
      (Integer/parseInt part)
      )
    )
  )

(defn get-ranges [edges]
  (for [e edges]
    (range (first e) (inc (last e)))
    )
  )

(defn get-intersection-count [ranges]
  (count (filter (fn [x] (some #(= x %) (first ranges))) (second ranges)))
  )

(defn contains-other? [pair]
  (let [ranges (get-ranges (get-edges pair))
        intersections (get-intersection-count ranges)]
    (or (= intersections (count (first ranges)))
        (= intersections (count (last ranges)))
        )
    )
  )

(defn get-containment-count []
  (count
    (filter true?
      (for [p pairs]
        (contains-other? p))))
  )

(println (get-containment-count))

; Day 4 / #2 =====================================================================================================================

(defn contains-any? [pair]
  (let [ranges (get-ranges (get-edges pair))]
    (not= 0 (get-intersection-count ranges))
    )
  )

(defn get-any-containment-count []
  (count
    (filter true?
        (for [p pairs]
          (contains-any? p))))
  )

(println (get-any-containment-count))
