from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ArticleArticleIdGet200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, author=None, claps=None, id=None, image_url=None, is_locked=None, is_series=None, lang=None, last_modified_at=None, publication_id=None, published_at=None, reading_time=None, responses_count=None, subtitle=None, tags=None, title=None, topics=None, url=None, voters=None, word_count=None):  # noqa: E501
        """ArticleArticleIdGet200Response - a model defined in OpenAPI

        :param author: The author of this ArticleArticleIdGet200Response.  # noqa: E501
        :type author: str
        :param claps: The claps of this ArticleArticleIdGet200Response.  # noqa: E501
        :type claps: int
        :param id: The id of this ArticleArticleIdGet200Response.  # noqa: E501
        :type id: str
        :param image_url: The image_url of this ArticleArticleIdGet200Response.  # noqa: E501
        :type image_url: str
        :param is_locked: The is_locked of this ArticleArticleIdGet200Response.  # noqa: E501
        :type is_locked: bool
        :param is_series: The is_series of this ArticleArticleIdGet200Response.  # noqa: E501
        :type is_series: bool
        :param lang: The lang of this ArticleArticleIdGet200Response.  # noqa: E501
        :type lang: str
        :param last_modified_at: The last_modified_at of this ArticleArticleIdGet200Response.  # noqa: E501
        :type last_modified_at: str
        :param publication_id: The publication_id of this ArticleArticleIdGet200Response.  # noqa: E501
        :type publication_id: str
        :param published_at: The published_at of this ArticleArticleIdGet200Response.  # noqa: E501
        :type published_at: str
        :param reading_time: The reading_time of this ArticleArticleIdGet200Response.  # noqa: E501
        :type reading_time: float
        :param responses_count: The responses_count of this ArticleArticleIdGet200Response.  # noqa: E501
        :type responses_count: int
        :param subtitle: The subtitle of this ArticleArticleIdGet200Response.  # noqa: E501
        :type subtitle: str
        :param tags: The tags of this ArticleArticleIdGet200Response.  # noqa: E501
        :type tags: List[str]
        :param title: The title of this ArticleArticleIdGet200Response.  # noqa: E501
        :type title: str
        :param topics: The topics of this ArticleArticleIdGet200Response.  # noqa: E501
        :type topics: List[str]
        :param url: The url of this ArticleArticleIdGet200Response.  # noqa: E501
        :type url: str
        :param voters: The voters of this ArticleArticleIdGet200Response.  # noqa: E501
        :type voters: int
        :param word_count: The word_count of this ArticleArticleIdGet200Response.  # noqa: E501
        :type word_count: int
        """
        self.openapi_types = {
            'author': str,
            'claps': int,
            'id': str,
            'image_url': str,
            'is_locked': bool,
            'is_series': bool,
            'lang': str,
            'last_modified_at': str,
            'publication_id': str,
            'published_at': str,
            'reading_time': float,
            'responses_count': int,
            'subtitle': str,
            'tags': List[str],
            'title': str,
            'topics': List[str],
            'url': str,
            'voters': int,
            'word_count': int
        }

        self.attribute_map = {
            'author': 'author',
            'claps': 'claps',
            'id': 'id',
            'image_url': 'image_url',
            'is_locked': 'is_locked',
            'is_series': 'is_series',
            'lang': 'lang',
            'last_modified_at': 'last_modified_at',
            'publication_id': 'publication_id',
            'published_at': 'published_at',
            'reading_time': 'reading_time',
            'responses_count': 'responses_count',
            'subtitle': 'subtitle',
            'tags': 'tags',
            'title': 'title',
            'topics': 'topics',
            'url': 'url',
            'voters': 'voters',
            'word_count': 'word_count'
        }

        self._author = author
        self._claps = claps
        self._id = id
        self._image_url = image_url
        self._is_locked = is_locked
        self._is_series = is_series
        self._lang = lang
        self._last_modified_at = last_modified_at
        self._publication_id = publication_id
        self._published_at = published_at
        self._reading_time = reading_time
        self._responses_count = responses_count
        self._subtitle = subtitle
        self._tags = tags
        self._title = title
        self._topics = topics
        self._url = url
        self._voters = voters
        self._word_count = word_count

    @classmethod
    def from_dict(cls, dikt) -> 'ArticleArticleIdGet200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _article__article_id__get_200_response of this ArticleArticleIdGet200Response.  # noqa: E501
        :rtype: ArticleArticleIdGet200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def author(self) -> str:
        """Gets the author of this ArticleArticleIdGet200Response.


        :return: The author of this ArticleArticleIdGet200Response.
        :rtype: str
        """
        return self._author

    @author.setter
    def author(self, author: str):
        """Sets the author of this ArticleArticleIdGet200Response.


        :param author: The author of this ArticleArticleIdGet200Response.
        :type author: str
        """

        self._author = author

    @property
    def claps(self) -> int:
        """Gets the claps of this ArticleArticleIdGet200Response.


        :return: The claps of this ArticleArticleIdGet200Response.
        :rtype: int
        """
        return self._claps

    @claps.setter
    def claps(self, claps: int):
        """Sets the claps of this ArticleArticleIdGet200Response.


        :param claps: The claps of this ArticleArticleIdGet200Response.
        :type claps: int
        """

        self._claps = claps

    @property
    def id(self) -> str:
        """Gets the id of this ArticleArticleIdGet200Response.


        :return: The id of this ArticleArticleIdGet200Response.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ArticleArticleIdGet200Response.


        :param id: The id of this ArticleArticleIdGet200Response.
        :type id: str
        """

        self._id = id

    @property
    def image_url(self) -> str:
        """Gets the image_url of this ArticleArticleIdGet200Response.


        :return: The image_url of this ArticleArticleIdGet200Response.
        :rtype: str
        """
        return self._image_url

    @image_url.setter
    def image_url(self, image_url: str):
        """Sets the image_url of this ArticleArticleIdGet200Response.


        :param image_url: The image_url of this ArticleArticleIdGet200Response.
        :type image_url: str
        """

        self._image_url = image_url

    @property
    def is_locked(self) -> bool:
        """Gets the is_locked of this ArticleArticleIdGet200Response.


        :return: The is_locked of this ArticleArticleIdGet200Response.
        :rtype: bool
        """
        return self._is_locked

    @is_locked.setter
    def is_locked(self, is_locked: bool):
        """Sets the is_locked of this ArticleArticleIdGet200Response.


        :param is_locked: The is_locked of this ArticleArticleIdGet200Response.
        :type is_locked: bool
        """

        self._is_locked = is_locked

    @property
    def is_series(self) -> bool:
        """Gets the is_series of this ArticleArticleIdGet200Response.


        :return: The is_series of this ArticleArticleIdGet200Response.
        :rtype: bool
        """
        return self._is_series

    @is_series.setter
    def is_series(self, is_series: bool):
        """Sets the is_series of this ArticleArticleIdGet200Response.


        :param is_series: The is_series of this ArticleArticleIdGet200Response.
        :type is_series: bool
        """

        self._is_series = is_series

    @property
    def lang(self) -> str:
        """Gets the lang of this ArticleArticleIdGet200Response.


        :return: The lang of this ArticleArticleIdGet200Response.
        :rtype: str
        """
        return self._lang

    @lang.setter
    def lang(self, lang: str):
        """Sets the lang of this ArticleArticleIdGet200Response.


        :param lang: The lang of this ArticleArticleIdGet200Response.
        :type lang: str
        """

        self._lang = lang

    @property
    def last_modified_at(self) -> str:
        """Gets the last_modified_at of this ArticleArticleIdGet200Response.


        :return: The last_modified_at of this ArticleArticleIdGet200Response.
        :rtype: str
        """
        return self._last_modified_at

    @last_modified_at.setter
    def last_modified_at(self, last_modified_at: str):
        """Sets the last_modified_at of this ArticleArticleIdGet200Response.


        :param last_modified_at: The last_modified_at of this ArticleArticleIdGet200Response.
        :type last_modified_at: str
        """

        self._last_modified_at = last_modified_at

    @property
    def publication_id(self) -> str:
        """Gets the publication_id of this ArticleArticleIdGet200Response.


        :return: The publication_id of this ArticleArticleIdGet200Response.
        :rtype: str
        """
        return self._publication_id

    @publication_id.setter
    def publication_id(self, publication_id: str):
        """Sets the publication_id of this ArticleArticleIdGet200Response.


        :param publication_id: The publication_id of this ArticleArticleIdGet200Response.
        :type publication_id: str
        """

        self._publication_id = publication_id

    @property
    def published_at(self) -> str:
        """Gets the published_at of this ArticleArticleIdGet200Response.


        :return: The published_at of this ArticleArticleIdGet200Response.
        :rtype: str
        """
        return self._published_at

    @published_at.setter
    def published_at(self, published_at: str):
        """Sets the published_at of this ArticleArticleIdGet200Response.


        :param published_at: The published_at of this ArticleArticleIdGet200Response.
        :type published_at: str
        """

        self._published_at = published_at

    @property
    def reading_time(self) -> float:
        """Gets the reading_time of this ArticleArticleIdGet200Response.


        :return: The reading_time of this ArticleArticleIdGet200Response.
        :rtype: float
        """
        return self._reading_time

    @reading_time.setter
    def reading_time(self, reading_time: float):
        """Sets the reading_time of this ArticleArticleIdGet200Response.


        :param reading_time: The reading_time of this ArticleArticleIdGet200Response.
        :type reading_time: float
        """

        self._reading_time = reading_time

    @property
    def responses_count(self) -> int:
        """Gets the responses_count of this ArticleArticleIdGet200Response.


        :return: The responses_count of this ArticleArticleIdGet200Response.
        :rtype: int
        """
        return self._responses_count

    @responses_count.setter
    def responses_count(self, responses_count: int):
        """Sets the responses_count of this ArticleArticleIdGet200Response.


        :param responses_count: The responses_count of this ArticleArticleIdGet200Response.
        :type responses_count: int
        """

        self._responses_count = responses_count

    @property
    def subtitle(self) -> str:
        """Gets the subtitle of this ArticleArticleIdGet200Response.


        :return: The subtitle of this ArticleArticleIdGet200Response.
        :rtype: str
        """
        return self._subtitle

    @subtitle.setter
    def subtitle(self, subtitle: str):
        """Sets the subtitle of this ArticleArticleIdGet200Response.


        :param subtitle: The subtitle of this ArticleArticleIdGet200Response.
        :type subtitle: str
        """

        self._subtitle = subtitle

    @property
    def tags(self) -> List[str]:
        """Gets the tags of this ArticleArticleIdGet200Response.


        :return: The tags of this ArticleArticleIdGet200Response.
        :rtype: List[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List[str]):
        """Sets the tags of this ArticleArticleIdGet200Response.


        :param tags: The tags of this ArticleArticleIdGet200Response.
        :type tags: List[str]
        """

        self._tags = tags

    @property
    def title(self) -> str:
        """Gets the title of this ArticleArticleIdGet200Response.


        :return: The title of this ArticleArticleIdGet200Response.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ArticleArticleIdGet200Response.


        :param title: The title of this ArticleArticleIdGet200Response.
        :type title: str
        """

        self._title = title

    @property
    def topics(self) -> List[str]:
        """Gets the topics of this ArticleArticleIdGet200Response.


        :return: The topics of this ArticleArticleIdGet200Response.
        :rtype: List[str]
        """
        return self._topics

    @topics.setter
    def topics(self, topics: List[str]):
        """Sets the topics of this ArticleArticleIdGet200Response.


        :param topics: The topics of this ArticleArticleIdGet200Response.
        :type topics: List[str]
        """

        self._topics = topics

    @property
    def url(self) -> str:
        """Gets the url of this ArticleArticleIdGet200Response.


        :return: The url of this ArticleArticleIdGet200Response.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this ArticleArticleIdGet200Response.


        :param url: The url of this ArticleArticleIdGet200Response.
        :type url: str
        """

        self._url = url

    @property
    def voters(self) -> int:
        """Gets the voters of this ArticleArticleIdGet200Response.


        :return: The voters of this ArticleArticleIdGet200Response.
        :rtype: int
        """
        return self._voters

    @voters.setter
    def voters(self, voters: int):
        """Sets the voters of this ArticleArticleIdGet200Response.


        :param voters: The voters of this ArticleArticleIdGet200Response.
        :type voters: int
        """

        self._voters = voters

    @property
    def word_count(self) -> int:
        """Gets the word_count of this ArticleArticleIdGet200Response.


        :return: The word_count of this ArticleArticleIdGet200Response.
        :rtype: int
        """
        return self._word_count

    @word_count.setter
    def word_count(self, word_count: int):
        """Sets the word_count of this ArticleArticleIdGet200Response.


        :param word_count: The word_count of this ArticleArticleIdGet200Response.
        :type word_count: int
        """

        self._word_count = word_count