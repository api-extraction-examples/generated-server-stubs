from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.link import Link
from openapi_server import util

from openapi_server.models.link import Link  # noqa: E501

class DefaultLinks(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, next=None, previous=None, _self=None):  # noqa: E501
        """DefaultLinks - a model defined in OpenAPI

        :param next: The next of this DefaultLinks.  # noqa: E501
        :type next: Link
        :param previous: The previous of this DefaultLinks.  # noqa: E501
        :type previous: Link
        :param _self: The _self of this DefaultLinks.  # noqa: E501
        :type _self: Link
        """
        self.openapi_types = {
            'next': Link,
            'previous': Link,
            '_self': Link
        }

        self.attribute_map = {
            'next': 'next',
            'previous': 'previous',
            '_self': 'self'
        }

        self._next = next
        self._previous = previous
        self.__self = _self

    @classmethod
    def from_dict(cls, dikt) -> 'DefaultLinks':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DefaultLinks of this DefaultLinks.  # noqa: E501
        :rtype: DefaultLinks
        """
        return util.deserialize_model(dikt, cls)

    @property
    def next(self) -> Link:
        """Gets the next of this DefaultLinks.


        :return: The next of this DefaultLinks.
        :rtype: Link
        """
        return self._next

    @next.setter
    def next(self, next: Link):
        """Sets the next of this DefaultLinks.


        :param next: The next of this DefaultLinks.
        :type next: Link
        """

        self._next = next

    @property
    def previous(self) -> Link:
        """Gets the previous of this DefaultLinks.


        :return: The previous of this DefaultLinks.
        :rtype: Link
        """
        return self._previous

    @previous.setter
    def previous(self, previous: Link):
        """Sets the previous of this DefaultLinks.


        :param previous: The previous of this DefaultLinks.
        :type previous: Link
        """

        self._previous = previous

    @property
    def _self(self) -> Link:
        """Gets the _self of this DefaultLinks.


        :return: The _self of this DefaultLinks.
        :rtype: Link
        """
        return self.__self

    @_self.setter
    def _self(self, _self: Link):
        """Sets the _self of this DefaultLinks.


        :param _self: The _self of this DefaultLinks.
        :type _self: Link
        """

        self.__self = _self
