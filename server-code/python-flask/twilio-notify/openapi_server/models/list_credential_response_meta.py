from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListCredentialResponseMeta(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, first_page_url=None, key=None, next_page_url=None, page=None, page_size=None, previous_page_url=None, url=None):  # noqa: E501
        """ListCredentialResponseMeta - a model defined in OpenAPI

        :param first_page_url: The first_page_url of this ListCredentialResponseMeta.  # noqa: E501
        :type first_page_url: str
        :param key: The key of this ListCredentialResponseMeta.  # noqa: E501
        :type key: str
        :param next_page_url: The next_page_url of this ListCredentialResponseMeta.  # noqa: E501
        :type next_page_url: str
        :param page: The page of this ListCredentialResponseMeta.  # noqa: E501
        :type page: int
        :param page_size: The page_size of this ListCredentialResponseMeta.  # noqa: E501
        :type page_size: int
        :param previous_page_url: The previous_page_url of this ListCredentialResponseMeta.  # noqa: E501
        :type previous_page_url: str
        :param url: The url of this ListCredentialResponseMeta.  # noqa: E501
        :type url: str
        """
        self.openapi_types = {
            'first_page_url': str,
            'key': str,
            'next_page_url': str,
            'page': int,
            'page_size': int,
            'previous_page_url': str,
            'url': str
        }

        self.attribute_map = {
            'first_page_url': 'first_page_url',
            'key': 'key',
            'next_page_url': 'next_page_url',
            'page': 'page',
            'page_size': 'page_size',
            'previous_page_url': 'previous_page_url',
            'url': 'url'
        }

        self._first_page_url = first_page_url
        self._key = key
        self._next_page_url = next_page_url
        self._page = page
        self._page_size = page_size
        self._previous_page_url = previous_page_url
        self._url = url

    @classmethod
    def from_dict(cls, dikt) -> 'ListCredentialResponseMeta':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListCredentialResponse_meta of this ListCredentialResponseMeta.  # noqa: E501
        :rtype: ListCredentialResponseMeta
        """
        return util.deserialize_model(dikt, cls)

    @property
    def first_page_url(self) -> str:
        """Gets the first_page_url of this ListCredentialResponseMeta.


        :return: The first_page_url of this ListCredentialResponseMeta.
        :rtype: str
        """
        return self._first_page_url

    @first_page_url.setter
    def first_page_url(self, first_page_url: str):
        """Sets the first_page_url of this ListCredentialResponseMeta.


        :param first_page_url: The first_page_url of this ListCredentialResponseMeta.
        :type first_page_url: str
        """

        self._first_page_url = first_page_url

    @property
    def key(self) -> str:
        """Gets the key of this ListCredentialResponseMeta.


        :return: The key of this ListCredentialResponseMeta.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this ListCredentialResponseMeta.


        :param key: The key of this ListCredentialResponseMeta.
        :type key: str
        """

        self._key = key

    @property
    def next_page_url(self) -> str:
        """Gets the next_page_url of this ListCredentialResponseMeta.


        :return: The next_page_url of this ListCredentialResponseMeta.
        :rtype: str
        """
        return self._next_page_url

    @next_page_url.setter
    def next_page_url(self, next_page_url: str):
        """Sets the next_page_url of this ListCredentialResponseMeta.


        :param next_page_url: The next_page_url of this ListCredentialResponseMeta.
        :type next_page_url: str
        """

        self._next_page_url = next_page_url

    @property
    def page(self) -> int:
        """Gets the page of this ListCredentialResponseMeta.


        :return: The page of this ListCredentialResponseMeta.
        :rtype: int
        """
        return self._page

    @page.setter
    def page(self, page: int):
        """Sets the page of this ListCredentialResponseMeta.


        :param page: The page of this ListCredentialResponseMeta.
        :type page: int
        """

        self._page = page

    @property
    def page_size(self) -> int:
        """Gets the page_size of this ListCredentialResponseMeta.


        :return: The page_size of this ListCredentialResponseMeta.
        :rtype: int
        """
        return self._page_size

    @page_size.setter
    def page_size(self, page_size: int):
        """Sets the page_size of this ListCredentialResponseMeta.


        :param page_size: The page_size of this ListCredentialResponseMeta.
        :type page_size: int
        """

        self._page_size = page_size

    @property
    def previous_page_url(self) -> str:
        """Gets the previous_page_url of this ListCredentialResponseMeta.


        :return: The previous_page_url of this ListCredentialResponseMeta.
        :rtype: str
        """
        return self._previous_page_url

    @previous_page_url.setter
    def previous_page_url(self, previous_page_url: str):
        """Sets the previous_page_url of this ListCredentialResponseMeta.


        :param previous_page_url: The previous_page_url of this ListCredentialResponseMeta.
        :type previous_page_url: str
        """

        self._previous_page_url = previous_page_url

    @property
    def url(self) -> str:
        """Gets the url of this ListCredentialResponseMeta.


        :return: The url of this ListCredentialResponseMeta.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this ListCredentialResponseMeta.


        :param url: The url of this ListCredentialResponseMeta.
        :type url: str
        """

        self._url = url
