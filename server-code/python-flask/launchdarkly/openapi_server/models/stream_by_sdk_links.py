from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.link import Link
from openapi_server import util

from openapi_server.models.link import Link  # noqa: E501

class StreamBySDKLinks(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, parent=None, _self=None):  # noqa: E501
        """StreamBySDKLinks - a model defined in OpenAPI

        :param parent: The parent of this StreamBySDKLinks.  # noqa: E501
        :type parent: Link
        :param _self: The _self of this StreamBySDKLinks.  # noqa: E501
        :type _self: Link
        """
        self.openapi_types = {
            'parent': Link,
            '_self': Link
        }

        self.attribute_map = {
            'parent': 'parent',
            '_self': 'self'
        }

        self._parent = parent
        self.__self = _self

    @classmethod
    def from_dict(cls, dikt) -> 'StreamBySDKLinks':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The StreamBySDKLinks of this StreamBySDKLinks.  # noqa: E501
        :rtype: StreamBySDKLinks
        """
        return util.deserialize_model(dikt, cls)

    @property
    def parent(self) -> Link:
        """Gets the parent of this StreamBySDKLinks.


        :return: The parent of this StreamBySDKLinks.
        :rtype: Link
        """
        return self._parent

    @parent.setter
    def parent(self, parent: Link):
        """Sets the parent of this StreamBySDKLinks.


        :param parent: The parent of this StreamBySDKLinks.
        :type parent: Link
        """

        self._parent = parent

    @property
    def _self(self) -> Link:
        """Gets the _self of this StreamBySDKLinks.


        :return: The _self of this StreamBySDKLinks.
        :rtype: Link
        """
        return self.__self

    @_self.setter
    def _self(self, _self: Link):
        """Sets the _self of this StreamBySDKLinks.


        :param _self: The _self of this StreamBySDKLinks.
        :type _self: Link
        """

        self.__self = _self
