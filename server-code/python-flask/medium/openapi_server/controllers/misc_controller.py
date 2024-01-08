import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.latestposts_topic_slug_get200_response import LatestpostsTopicSlugGet200Response  # noqa: E501
from openapi_server.models.related_tags_tag_get200_response import RelatedTagsTagGet200Response  # noqa: E501
from openapi_server.models.top_writer_topic_slug_get200_response import TopWriterTopicSlugGet200Response  # noqa: E501
from openapi_server.models.topfeeds_tag_mode_get200_response import TopfeedsTagModeGet200Response  # noqa: E501
from openapi_server import util


def latestposts_topic_slug_get(topic_slug):  # noqa: E501
    """Get Latest Posts

    Returns a list of latest posts (&#x60;article_ids&#x60;) for a topic/niche (as classified by the Medium platform). Example of a topic/niche can be: * blockchain * relationships * mental-health, etc …  These are known as &#x60;topic_slugs&#x60;. At any given moment, this endpoint will return a list of 25 articles (&#x60;article_ids&#x60;).  # noqa: E501

    :param topic_slug: It&#39;s a unique string, usually hyphen-separated, representing a topic/niche, as classified by Medium.
    :type topic_slug: str

    :rtype: Union[LatestpostsTopicSlugGet200Response, Tuple[LatestpostsTopicSlugGet200Response, int], Tuple[LatestpostsTopicSlugGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def related_tags_tag_get(tag):  # noqa: E501
    """Get Related Tags

    Returns a list of &#x60;related_tags&#x60; for the given &#x60;tag&#x60;.  # noqa: E501

    :param tag: It&#39;s a unique string, usually hyphen-separated, representing a class of content.
    :type tag: str

    :rtype: Union[RelatedTagsTagGet200Response, Tuple[RelatedTagsTagGet200Response, int], Tuple[RelatedTagsTagGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def top_writer_topic_slug_get(topic_slug, count=None):  # noqa: E501
    """Get Top Writers

    Returns a list of top writers (&#x60;user_ids&#x60;) within a particular topic/niche (&#x60;topic_slug&#x60;).  e.g.  - blockchain - relationships - artificial-intelligence, etc ...  **Note:** You can use optional &#x60;count&#x60; query parameter to limit the number of results.  The maximum number of top writers within a topic/niche will be 250.  # noqa: E501

    :param topic_slug: It&#39;s a unique string, usually hyphen-separated, representing a topic/niche, as classified by Medium.
    :type topic_slug: str
    :param count: Limits the number of &#x60;article_ids&#x60; in the result.
    :type count: int

    :rtype: Union[TopWriterTopicSlugGet200Response, Tuple[TopWriterTopicSlugGet200Response, int], Tuple[TopWriterTopicSlugGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def topfeeds_tag_mode_get(tag, mode, after=None, count=None):  # noqa: E501
    """Get Topfeeds

    Returns a list of &#x60;article_ids&#x60; (length: 25) for the given &#x60;tag&#x60; and &#x60;mode&#x60;.  # noqa: E501

    :param tag: It&#39;s a unique string, usually hyphen-separated, representing a class of content.
    :type tag: str
    :param mode: Mode:    - &#x60;hot&#x60; : For getting trending articles   - &#x60;new&#x60; : For getting latest articles   - &#x60;top_year&#x60; : For getting best articles of the year   - &#x60;top_month&#x60; : For getting best articles of the month   - &#x60;top_week&#x60; : For getting best articles of the week   - &#x60;top_all_time&#x60;: For getting best article of all time 
    :type mode: str
    :param after: To get the subsequent top feeds. (&#x60;after&#x60; &amp;lt; 250)
    :type after: int
    :param count: To limit the number of top feeds. (&#x60;count&#x60; &amp;lt; 25)
    :type count: int

    :rtype: Union[TopfeedsTagModeGet200Response, Tuple[TopfeedsTagModeGet200Response, int], Tuple[TopfeedsTagModeGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
