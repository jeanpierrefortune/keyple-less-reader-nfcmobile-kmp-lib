//[keyple-less-reader-nfcmobile-kmp-lib](../../../index.md)/[org.eclipse.keyple.keypleless.reader.nfcmobile](../index.md)/[LocalNfcReader](index.md)/[getPowerOnData](get-power-on-data.md)

# getPowerOnData

[common, android, jvm]\
[common]\
expect fun [getPowerOnData](get-power-on-data.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

[android, jvm]\
actual fun [getPowerOnData](get-power-on-data.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Gets the power-on data. The power-on data is defined as the data retrieved by the reader when the card is inserted.

In the case of a contactless reader, the reader decides what this data is. Contactless readers provide a virtual ATR (partially standardized by the PC/SC standard), but other devices can have their own definition, including for example elements from the anti-collision stage of the ISO14443 protocol (ATQA, ATQB, ATS, SAK, etc).

These data being variable from one reader to another, they are defined here in string format which can be either a hexadecimal string or any other relevant information.

#### Return

a non empty String
