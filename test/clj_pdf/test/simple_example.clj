

(ns clj-pdf.test.simple-example
  (:use clj-pdf.core)
  (:use clojure.java.shell)
  )

(pdf
  [{:title "Test doc"
    :orientation   :landscape
    :table-of-contents true
    :pages true
    }
   [:chapter [:paragraph {:color [250 0 0]} "First Chapter"]
    [:section "Section Title" "Some content"]
    [:section [:paragraph {:size 10} "Section Title"]
     [:paragraph "Some content"]
     [:paragraph "Some more content"]
     [:section {:color [100 200 50]} [:paragraph "Nested Section Title"]
      [:paragraph "nested section content"]]]]
    [:pagebreak]
   [:chapter [:paragraph {:color [250 0 0]} "Second Chapter"]
    [:section "Section Title" "Awesome content"]]
   [:pagebreak]
   [:chapter [:paragraph {:color [250 0 0]} "Third Chapter"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]]
   [:chapter [:paragraph {:color [250 0 0]} "Third Chapter"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    [:section "Section Title" "Awesome content"]
    ]
   ]
  "doc.pdf")

(sh "explorer.exe" "doc.pdf")
