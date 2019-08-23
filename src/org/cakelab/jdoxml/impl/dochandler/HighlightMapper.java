package org.cakelab.jdoxml.impl.dochandler;

import java.util.HashMap;
import java.util.Map;

class HighlightMapper
{
    Map<String, HighlightHandler.HighlightKind> m_map = new HashMap<String, HighlightHandler.HighlightKind>();
    
    HighlightMapper()
    {
        m_map.put("normal",        HighlightHandler.HighlightKind.Invalid);
        m_map.put("comment",        HighlightHandler.HighlightKind.Comment);
      m_map.put("keyword",        HighlightHandler.HighlightKind.Keyword);
      m_map.put("keywordtype",    HighlightHandler.HighlightKind.KeywordType);
      m_map.put("keywordflow",    HighlightHandler.HighlightKind.KeywordFlow);
      m_map.put("charliteral",    HighlightHandler.HighlightKind.CharLiteral);
      m_map.put("stringliteral",  HighlightHandler.HighlightKind.StringLiteral);
      m_map.put("preprocessor",   HighlightHandler.HighlightKind.Preprocessor);
    }
    HighlightHandler.HighlightKind stringToKind(String kindStr)
    {
      return m_map.get(kindStr);
    }
}