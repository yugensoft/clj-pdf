

(ns clj-pdf.test.simple-example
  (:use clj-pdf.core)
  (:use clojure.java.shell)
  )

(pdf
  [{:title "Test doc"
    :orientation   :portrait
    :pages true
    }
   [:paragraph {:style :bold :size 20 :align :center} "Title Page" ]
   [:pagebreak]
   [:table-of-contents]
   [:pagebreak]
   [:chapter [:paragraph {:color [250 0 0]} "First Chapter"]
    [:section "Section 1" "Some content"]
    [:section [:paragraph {:size 10} "Section 2"]
     [:paragraph "Some content"]
     [:paragraph "Some more content"]
     [:section {:color [100 200 50]} [:paragraph "Nested Section Title"]
      [:paragraph "nested section content"]]]]
    [:pagebreak]
   [:chapter [:paragraph {:color [250 0 0]} "Second Chapter"]
    [:section "Section 1" "Awesome content"]]
   [:pagebreak]
   [:chapter [:paragraph {:color [250 0 0]} "Third Chapter"]
    [:section "Section 1" "Awesome content"]
    [:section "Section 2" "Awesome content"]
    [:section "Section 3" "Awesome content"]
    [:section "Section 4" "Awesome content"]
    [:section "Section 5" "Awesome content"]
    [:section "Section 6" "Awesome content"]
    [:section "Section 7" "Awesome content"]
    [:section "Section 8" "Awesome content"]
    [:section "Section 9" "Awesome content"]
    [:section "Section 10" "Awesome content"]
    [:section "Section 11" "Awesome content"]
    [:section "Section 12" "Awesome content"]]
   [:chapter [:paragraph {:color [250 0 0]} "Fourth Chapter"]
    [:section "Section 1" "Awesome content"]
    [:section "Section 2" "Awesome content"]
    [:section "Section 3" "Awesome content"]
    [:section "Section 4" "Awesome content"]
    [:section "Section 5" "Awesome content"]
    [:section "Section 6" "Awesome content"]
    [:section "Section 7" "Awesome content"]
    [:section "Section 8" "Awesome content"]
    [:section "Section 9" "Awesome content"]
    [:section "Section 10" "Awesome content"]
    [:section "Section 11" "Awesome content"]
    [:section "Section 12" "Awesome content"]
    ]
   ]
  "doc.pdf")

(sh "explorer.exe" "doc.pdf")
