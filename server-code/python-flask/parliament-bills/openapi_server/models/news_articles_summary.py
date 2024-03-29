from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class NewsArticlesSummary(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, content=None, display_date=None, id=None, title=None):  # noqa: E501
        """NewsArticlesSummary - a model defined in OpenAPI

        :param content: The content of this NewsArticlesSummary.  # noqa: E501
        :type content: str
        :param display_date: The display_date of this NewsArticlesSummary.  # noqa: E501
        :type display_date: datetime
        :param id: The id of this NewsArticlesSummary.  # noqa: E501
        :type id: int
        :param title: The title of this NewsArticlesSummary.  # noqa: E501
        :type title: str
        """
        self.openapi_types = {
            'content': str,
            'display_date': datetime,
            'id': int,
            'title': str
        }

        self.attribute_map = {
            'content': 'content',
            'display_date': 'displayDate',
            'id': 'id',
            'title': 'title'
        }

        self._content = content
        self._display_date = display_date
        self._id = id
        self._title = title

    @classmethod
    def from_dict(cls, dikt) -> 'NewsArticlesSummary':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The NewsArticlesSummary of this NewsArticlesSummary.  # noqa: E501
        :rtype: NewsArticlesSummary
        """
        return util.deserialize_model(dikt, cls)

    @property
    def content(self) -> str:
        """Gets the content of this NewsArticlesSummary.


        :return: The content of this NewsArticlesSummary.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content: str):
        """Sets the content of this NewsArticlesSummary.


        :param content: The content of this NewsArticlesSummary.
        :type content: str
        """

        self._content = content

    @property
    def display_date(self) -> datetime:
        """Gets the display_date of this NewsArticlesSummary.


        :return: The display_date of this NewsArticlesSummary.
        :rtype: datetime
        """
        return self._display_date

    @display_date.setter
    def display_date(self, display_date: datetime):
        """Sets the display_date of this NewsArticlesSummary.


        :param display_date: The display_date of this NewsArticlesSummary.
        :type display_date: datetime
        """

        self._display_date = display_date

    @property
    def id(self) -> int:
        """Gets the id of this NewsArticlesSummary.


        :return: The id of this NewsArticlesSummary.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this NewsArticlesSummary.


        :param id: The id of this NewsArticlesSummary.
        :type id: int
        """

        self._id = id

    @property
    def title(self) -> str:
        """Gets the title of this NewsArticlesSummary.


        :return: The title of this NewsArticlesSummary.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this NewsArticlesSummary.


        :param title: The title of this NewsArticlesSummary.
        :type title: str
        """

        self._title = title
