from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.simple_link import SimpleLink
from openapi_server import util

from openapi_server.models.simple_link import SimpleLink  # noqa: E501

class LinkGroup(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, groups=None, header=None, id=None, links=None, style_class=None, weight=None):  # noqa: E501
        """LinkGroup - a model defined in OpenAPI

        :param groups: The groups of this LinkGroup.  # noqa: E501
        :type groups: List[LinkGroup]
        :param header: The header of this LinkGroup.  # noqa: E501
        :type header: SimpleLink
        :param id: The id of this LinkGroup.  # noqa: E501
        :type id: str
        :param links: The links of this LinkGroup.  # noqa: E501
        :type links: List[SimpleLink]
        :param style_class: The style_class of this LinkGroup.  # noqa: E501
        :type style_class: str
        :param weight: The weight of this LinkGroup.  # noqa: E501
        :type weight: int
        """
        self.openapi_types = {
            'groups': List[LinkGroup],
            'header': SimpleLink,
            'id': str,
            'links': List[SimpleLink],
            'style_class': str,
            'weight': int
        }

        self.attribute_map = {
            'groups': 'groups',
            'header': 'header',
            'id': 'id',
            'links': 'links',
            'style_class': 'styleClass',
            'weight': 'weight'
        }

        self._groups = groups
        self._header = header
        self._id = id
        self._links = links
        self._style_class = style_class
        self._weight = weight

    @classmethod
    def from_dict(cls, dikt) -> 'LinkGroup':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The LinkGroup of this LinkGroup.  # noqa: E501
        :rtype: LinkGroup
        """
        return util.deserialize_model(dikt, cls)

    @property
    def groups(self) -> List[LinkGroup]:
        """Gets the groups of this LinkGroup.


        :return: The groups of this LinkGroup.
        :rtype: List[LinkGroup]
        """
        return self._groups

    @groups.setter
    def groups(self, groups: List[LinkGroup]):
        """Sets the groups of this LinkGroup.


        :param groups: The groups of this LinkGroup.
        :type groups: List[LinkGroup]
        """

        self._groups = groups

    @property
    def header(self) -> SimpleLink:
        """Gets the header of this LinkGroup.


        :return: The header of this LinkGroup.
        :rtype: SimpleLink
        """
        return self._header

    @header.setter
    def header(self, header: SimpleLink):
        """Sets the header of this LinkGroup.


        :param header: The header of this LinkGroup.
        :type header: SimpleLink
        """

        self._header = header

    @property
    def id(self) -> str:
        """Gets the id of this LinkGroup.


        :return: The id of this LinkGroup.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this LinkGroup.


        :param id: The id of this LinkGroup.
        :type id: str
        """

        self._id = id

    @property
    def links(self) -> List[SimpleLink]:
        """Gets the links of this LinkGroup.


        :return: The links of this LinkGroup.
        :rtype: List[SimpleLink]
        """
        return self._links

    @links.setter
    def links(self, links: List[SimpleLink]):
        """Sets the links of this LinkGroup.


        :param links: The links of this LinkGroup.
        :type links: List[SimpleLink]
        """

        self._links = links

    @property
    def style_class(self) -> str:
        """Gets the style_class of this LinkGroup.


        :return: The style_class of this LinkGroup.
        :rtype: str
        """
        return self._style_class

    @style_class.setter
    def style_class(self, style_class: str):
        """Sets the style_class of this LinkGroup.


        :param style_class: The style_class of this LinkGroup.
        :type style_class: str
        """

        self._style_class = style_class

    @property
    def weight(self) -> int:
        """Gets the weight of this LinkGroup.


        :return: The weight of this LinkGroup.
        :rtype: int
        """
        return self._weight

    @weight.setter
    def weight(self, weight: int):
        """Sets the weight of this LinkGroup.


        :param weight: The weight of this LinkGroup.
        :type weight: int
        """

        self._weight = weight
