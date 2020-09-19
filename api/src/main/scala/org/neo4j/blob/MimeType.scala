package org.neo4j.blob

case class MimeType(code: Long, text: String) {
  def major = text.split("/")(0);

  def minor = text.split("/")(1);
}