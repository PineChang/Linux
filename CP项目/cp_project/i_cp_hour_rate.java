// ORM class for table 'i_cp_hour_rate'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Jun 12 10:35:17 CST 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class i_cp_hour_rate extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String platContentTypeSid;
  public String get_platContentTypeSid() {
    return platContentTypeSid;
  }
  public void set_platContentTypeSid(String platContentTypeSid) {
    this.platContentTypeSid = platContentTypeSid;
  }
  public i_cp_hour_rate with_platContentTypeSid(String platContentTypeSid) {
    this.platContentTypeSid = platContentTypeSid;
    return this;
  }
  private String platContentTypeCode;
  public String get_platContentTypeCode() {
    return platContentTypeCode;
  }
  public void set_platContentTypeCode(String platContentTypeCode) {
    this.platContentTypeCode = platContentTypeCode;
  }
  public i_cp_hour_rate with_platContentTypeCode(String platContentTypeCode) {
    this.platContentTypeCode = platContentTypeCode;
    return this;
  }
  private String platContentTypeName;
  public String get_platContentTypeName() {
    return platContentTypeName;
  }
  public void set_platContentTypeName(String platContentTypeName) {
    this.platContentTypeName = platContentTypeName;
  }
  public i_cp_hour_rate with_platContentTypeName(String platContentTypeName) {
    this.platContentTypeName = platContentTypeName;
    return this;
  }
  private String hr;
  public String get_hr() {
    return hr;
  }
  public void set_hr(String hr) {
    this.hr = hr;
  }
  public i_cp_hour_rate with_hr(String hr) {
    this.hr = hr;
    return this;
  }
  private Integer succ_cnt;
  public Integer get_succ_cnt() {
    return succ_cnt;
  }
  public void set_succ_cnt(Integer succ_cnt) {
    this.succ_cnt = succ_cnt;
  }
  public i_cp_hour_rate with_succ_cnt(Integer succ_cnt) {
    this.succ_cnt = succ_cnt;
    return this;
  }
  private Float succ_rate;
  public Float get_succ_rate() {
    return succ_rate;
  }
  public void set_succ_rate(Float succ_rate) {
    this.succ_rate = succ_rate;
  }
  public i_cp_hour_rate with_succ_rate(Float succ_rate) {
    this.succ_rate = succ_rate;
    return this;
  }
  private Integer fail_cnt;
  public Integer get_fail_cnt() {
    return fail_cnt;
  }
  public void set_fail_cnt(Integer fail_cnt) {
    this.fail_cnt = fail_cnt;
  }
  public i_cp_hour_rate with_fail_cnt(Integer fail_cnt) {
    this.fail_cnt = fail_cnt;
    return this;
  }
  private Float fail_rate;
  public Float get_fail_rate() {
    return fail_rate;
  }
  public void set_fail_rate(Float fail_rate) {
    this.fail_rate = fail_rate;
  }
  public i_cp_hour_rate with_fail_rate(Float fail_rate) {
    this.fail_rate = fail_rate;
    return this;
  }
  private Integer total;
  public Integer get_total() {
    return total;
  }
  public void set_total(Integer total) {
    this.total = total;
  }
  public i_cp_hour_rate with_total(Integer total) {
    this.total = total;
    return this;
  }
  private java.sql.Date cp_date;
  public java.sql.Date get_cp_date() {
    return cp_date;
  }
  public void set_cp_date(java.sql.Date cp_date) {
    this.cp_date = cp_date;
  }
  public i_cp_hour_rate with_cp_date(java.sql.Date cp_date) {
    this.cp_date = cp_date;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof i_cp_hour_rate)) {
      return false;
    }
    i_cp_hour_rate that = (i_cp_hour_rate) o;
    boolean equal = true;
    equal = equal && (this.platContentTypeSid == null ? that.platContentTypeSid == null : this.platContentTypeSid.equals(that.platContentTypeSid));
    equal = equal && (this.platContentTypeCode == null ? that.platContentTypeCode == null : this.platContentTypeCode.equals(that.platContentTypeCode));
    equal = equal && (this.platContentTypeName == null ? that.platContentTypeName == null : this.platContentTypeName.equals(that.platContentTypeName));
    equal = equal && (this.hr == null ? that.hr == null : this.hr.equals(that.hr));
    equal = equal && (this.succ_cnt == null ? that.succ_cnt == null : this.succ_cnt.equals(that.succ_cnt));
    equal = equal && (this.succ_rate == null ? that.succ_rate == null : this.succ_rate.equals(that.succ_rate));
    equal = equal && (this.fail_cnt == null ? that.fail_cnt == null : this.fail_cnt.equals(that.fail_cnt));
    equal = equal && (this.fail_rate == null ? that.fail_rate == null : this.fail_rate.equals(that.fail_rate));
    equal = equal && (this.total == null ? that.total == null : this.total.equals(that.total));
    equal = equal && (this.cp_date == null ? that.cp_date == null : this.cp_date.equals(that.cp_date));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof i_cp_hour_rate)) {
      return false;
    }
    i_cp_hour_rate that = (i_cp_hour_rate) o;
    boolean equal = true;
    equal = equal && (this.platContentTypeSid == null ? that.platContentTypeSid == null : this.platContentTypeSid.equals(that.platContentTypeSid));
    equal = equal && (this.platContentTypeCode == null ? that.platContentTypeCode == null : this.platContentTypeCode.equals(that.platContentTypeCode));
    equal = equal && (this.platContentTypeName == null ? that.platContentTypeName == null : this.platContentTypeName.equals(that.platContentTypeName));
    equal = equal && (this.hr == null ? that.hr == null : this.hr.equals(that.hr));
    equal = equal && (this.succ_cnt == null ? that.succ_cnt == null : this.succ_cnt.equals(that.succ_cnt));
    equal = equal && (this.succ_rate == null ? that.succ_rate == null : this.succ_rate.equals(that.succ_rate));
    equal = equal && (this.fail_cnt == null ? that.fail_cnt == null : this.fail_cnt.equals(that.fail_cnt));
    equal = equal && (this.fail_rate == null ? that.fail_rate == null : this.fail_rate.equals(that.fail_rate));
    equal = equal && (this.total == null ? that.total == null : this.total.equals(that.total));
    equal = equal && (this.cp_date == null ? that.cp_date == null : this.cp_date.equals(that.cp_date));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.platContentTypeSid = JdbcWritableBridge.readString(1, __dbResults);
    this.platContentTypeCode = JdbcWritableBridge.readString(2, __dbResults);
    this.platContentTypeName = JdbcWritableBridge.readString(3, __dbResults);
    this.hr = JdbcWritableBridge.readString(4, __dbResults);
    this.succ_cnt = JdbcWritableBridge.readInteger(5, __dbResults);
    this.succ_rate = JdbcWritableBridge.readFloat(6, __dbResults);
    this.fail_cnt = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fail_rate = JdbcWritableBridge.readFloat(8, __dbResults);
    this.total = JdbcWritableBridge.readInteger(9, __dbResults);
    this.cp_date = JdbcWritableBridge.readDate(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.platContentTypeSid = JdbcWritableBridge.readString(1, __dbResults);
    this.platContentTypeCode = JdbcWritableBridge.readString(2, __dbResults);
    this.platContentTypeName = JdbcWritableBridge.readString(3, __dbResults);
    this.hr = JdbcWritableBridge.readString(4, __dbResults);
    this.succ_cnt = JdbcWritableBridge.readInteger(5, __dbResults);
    this.succ_rate = JdbcWritableBridge.readFloat(6, __dbResults);
    this.fail_cnt = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fail_rate = JdbcWritableBridge.readFloat(8, __dbResults);
    this.total = JdbcWritableBridge.readInteger(9, __dbResults);
    this.cp_date = JdbcWritableBridge.readDate(10, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(platContentTypeSid, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(platContentTypeCode, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(platContentTypeName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hr, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(succ_cnt, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(succ_rate, 6 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(fail_cnt, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(fail_rate, 8 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(total, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(cp_date, 10 + __off, 91, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(platContentTypeSid, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(platContentTypeCode, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(platContentTypeName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hr, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(succ_cnt, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(succ_rate, 6 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(fail_cnt, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(fail_rate, 8 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(total, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(cp_date, 10 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.platContentTypeSid = null;
    } else {
    this.platContentTypeSid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.platContentTypeCode = null;
    } else {
    this.platContentTypeCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.platContentTypeName = null;
    } else {
    this.platContentTypeName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hr = null;
    } else {
    this.hr = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.succ_cnt = null;
    } else {
    this.succ_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.succ_rate = null;
    } else {
    this.succ_rate = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.fail_cnt = null;
    } else {
    this.fail_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fail_rate = null;
    } else {
    this.fail_rate = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.total = null;
    } else {
    this.total = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cp_date = null;
    } else {
    this.cp_date = new Date(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.platContentTypeSid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platContentTypeSid);
    }
    if (null == this.platContentTypeCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platContentTypeCode);
    }
    if (null == this.platContentTypeName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platContentTypeName);
    }
    if (null == this.hr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hr);
    }
    if (null == this.succ_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.succ_cnt);
    }
    if (null == this.succ_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.succ_rate);
    }
    if (null == this.fail_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fail_cnt);
    }
    if (null == this.fail_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.fail_rate);
    }
    if (null == this.total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.total);
    }
    if (null == this.cp_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cp_date.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.platContentTypeSid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platContentTypeSid);
    }
    if (null == this.platContentTypeCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platContentTypeCode);
    }
    if (null == this.platContentTypeName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platContentTypeName);
    }
    if (null == this.hr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hr);
    }
    if (null == this.succ_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.succ_cnt);
    }
    if (null == this.succ_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.succ_rate);
    }
    if (null == this.fail_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fail_cnt);
    }
    if (null == this.fail_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.fail_rate);
    }
    if (null == this.total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.total);
    }
    if (null == this.cp_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cp_date.getTime());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(platContentTypeSid==null?"null":platContentTypeSid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(platContentTypeCode==null?"null":platContentTypeCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(platContentTypeName==null?"null":platContentTypeName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hr==null?"null":hr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(succ_cnt==null?"null":"" + succ_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(succ_rate==null?"null":"" + succ_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fail_cnt==null?"null":"" + fail_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fail_rate==null?"null":"" + fail_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total==null?"null":"" + total, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cp_date==null?"null":"" + cp_date, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(platContentTypeSid==null?"null":platContentTypeSid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(platContentTypeCode==null?"null":platContentTypeCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(platContentTypeName==null?"null":platContentTypeName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hr==null?"null":hr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(succ_cnt==null?"null":"" + succ_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(succ_rate==null?"null":"" + succ_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fail_cnt==null?"null":"" + fail_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fail_rate==null?"null":"" + fail_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total==null?"null":"" + total, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cp_date==null?"null":"" + cp_date, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platContentTypeSid = null; } else {
      this.platContentTypeSid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platContentTypeCode = null; } else {
      this.platContentTypeCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platContentTypeName = null; } else {
      this.platContentTypeName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hr = null; } else {
      this.hr = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.succ_cnt = null; } else {
      this.succ_cnt = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.succ_rate = null; } else {
      this.succ_rate = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fail_cnt = null; } else {
      this.fail_cnt = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fail_rate = null; } else {
      this.fail_rate = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total = null; } else {
      this.total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cp_date = null; } else {
      this.cp_date = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platContentTypeSid = null; } else {
      this.platContentTypeSid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platContentTypeCode = null; } else {
      this.platContentTypeCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platContentTypeName = null; } else {
      this.platContentTypeName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hr = null; } else {
      this.hr = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.succ_cnt = null; } else {
      this.succ_cnt = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.succ_rate = null; } else {
      this.succ_rate = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fail_cnt = null; } else {
      this.fail_cnt = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fail_rate = null; } else {
      this.fail_rate = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total = null; } else {
      this.total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cp_date = null; } else {
      this.cp_date = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    i_cp_hour_rate o = (i_cp_hour_rate) super.clone();
    o.cp_date = (o.cp_date != null) ? (java.sql.Date) o.cp_date.clone() : null;
    return o;
  }

  public void clone0(i_cp_hour_rate o) throws CloneNotSupportedException {
    o.cp_date = (o.cp_date != null) ? (java.sql.Date) o.cp_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("platContentTypeSid", this.platContentTypeSid);
    __sqoop$field_map.put("platContentTypeCode", this.platContentTypeCode);
    __sqoop$field_map.put("platContentTypeName", this.platContentTypeName);
    __sqoop$field_map.put("hr", this.hr);
    __sqoop$field_map.put("succ_cnt", this.succ_cnt);
    __sqoop$field_map.put("succ_rate", this.succ_rate);
    __sqoop$field_map.put("fail_cnt", this.fail_cnt);
    __sqoop$field_map.put("fail_rate", this.fail_rate);
    __sqoop$field_map.put("total", this.total);
    __sqoop$field_map.put("cp_date", this.cp_date);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("platContentTypeSid", this.platContentTypeSid);
    __sqoop$field_map.put("platContentTypeCode", this.platContentTypeCode);
    __sqoop$field_map.put("platContentTypeName", this.platContentTypeName);
    __sqoop$field_map.put("hr", this.hr);
    __sqoop$field_map.put("succ_cnt", this.succ_cnt);
    __sqoop$field_map.put("succ_rate", this.succ_rate);
    __sqoop$field_map.put("fail_cnt", this.fail_cnt);
    __sqoop$field_map.put("fail_rate", this.fail_rate);
    __sqoop$field_map.put("total", this.total);
    __sqoop$field_map.put("cp_date", this.cp_date);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("platContentTypeSid".equals(__fieldName)) {
      this.platContentTypeSid = (String) __fieldVal;
    }
    else    if ("platContentTypeCode".equals(__fieldName)) {
      this.platContentTypeCode = (String) __fieldVal;
    }
    else    if ("platContentTypeName".equals(__fieldName)) {
      this.platContentTypeName = (String) __fieldVal;
    }
    else    if ("hr".equals(__fieldName)) {
      this.hr = (String) __fieldVal;
    }
    else    if ("succ_cnt".equals(__fieldName)) {
      this.succ_cnt = (Integer) __fieldVal;
    }
    else    if ("succ_rate".equals(__fieldName)) {
      this.succ_rate = (Float) __fieldVal;
    }
    else    if ("fail_cnt".equals(__fieldName)) {
      this.fail_cnt = (Integer) __fieldVal;
    }
    else    if ("fail_rate".equals(__fieldName)) {
      this.fail_rate = (Float) __fieldVal;
    }
    else    if ("total".equals(__fieldName)) {
      this.total = (Integer) __fieldVal;
    }
    else    if ("cp_date".equals(__fieldName)) {
      this.cp_date = (java.sql.Date) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("platContentTypeSid".equals(__fieldName)) {
      this.platContentTypeSid = (String) __fieldVal;
      return true;
    }
    else    if ("platContentTypeCode".equals(__fieldName)) {
      this.platContentTypeCode = (String) __fieldVal;
      return true;
    }
    else    if ("platContentTypeName".equals(__fieldName)) {
      this.platContentTypeName = (String) __fieldVal;
      return true;
    }
    else    if ("hr".equals(__fieldName)) {
      this.hr = (String) __fieldVal;
      return true;
    }
    else    if ("succ_cnt".equals(__fieldName)) {
      this.succ_cnt = (Integer) __fieldVal;
      return true;
    }
    else    if ("succ_rate".equals(__fieldName)) {
      this.succ_rate = (Float) __fieldVal;
      return true;
    }
    else    if ("fail_cnt".equals(__fieldName)) {
      this.fail_cnt = (Integer) __fieldVal;
      return true;
    }
    else    if ("fail_rate".equals(__fieldName)) {
      this.fail_rate = (Float) __fieldVal;
      return true;
    }
    else    if ("total".equals(__fieldName)) {
      this.total = (Integer) __fieldVal;
      return true;
    }
    else    if ("cp_date".equals(__fieldName)) {
      this.cp_date = (java.sql.Date) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
