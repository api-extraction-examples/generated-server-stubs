from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.link import Link
from openapi_server import util

from openapi_server.models.link import Link  # noqa: E501

class StreamLinks(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, parent=None, _self=None, subseries=None):  # noqa: E501
        """StreamLinks - a model defined in OpenAPI

        :param parent: The parent of this StreamLinks.  # noqa: E501
        :type parent: Link
        :param _self: The _self of this StreamLinks.  # noqa: E501
        :type _self: Link
        :param subseries: The subseries of this StreamLinks.  # noqa: E501
        :type subseries: List[Link]
        """
        self.openapi_types = {
            'parent': Link,
            '_self': Link,
            'subseries': List[Link]
        }

        self.attribute_map = {
            'parent': 'parent',
            '_self': 'self',
            'subseries': 'subseries'
        }

        self._parent = parent
        self.__self = _self
        self._subseries = subseries

    @classmethod
    def from_dict(cls, dikt) -> 'StreamLinks':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The StreamLinks of this StreamLinks.  # noqa: E501
        :rtype: StreamLinks
        """
        return util.deserialize_model(dikt, cls)

    @property
    def parent(self) -> Link:
        """Gets the parent of this StreamLinks.


        :return: The parent of this StreamLinks.
        :rtype: Link
        """
        return self._parent

    @parent.setter
    def parent(self, parent: Link):
        """Sets the parent of this StreamLinks.


        :param parent: The parent of this StreamLinks.
        :type parent: Link
        """

        self._parent = parent

    @property
    def _self(self) -> Link:
        """Gets the _self of this StreamLinks.


        :return: The _self of this StreamLinks.
        :rtype: Link
        """
        return self.__self

    @_self.setter
    def _self(self, _self: Link):
        """Sets the _self of this StreamLinks.


        :param _self: The _self of this StreamLinks.
        :type _self: Link
        """

        self.__self = _self

    @property
    def subseries(self) -> List[Link]:
        """Gets the subseries of this StreamLinks.

        Links to endpoints that are in the request path.  # noqa: E501

        :return: The subseries of this StreamLinks.
        :rtype: List[Link]
        """
        return self._subseries

    @subseries.setter
    def subseries(self, subseries: List[Link]):
        """Sets the subseries of this StreamLinks.

        Links to endpoints that are in the request path.  # noqa: E501

        :param subseries: The subseries of this StreamLinks.
        :type subseries: List[Link]
        """

        self._subseries = subseries
