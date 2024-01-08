from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.link_group import LinkGroup
from openapi_server import util

from openapi_server.models.link_group import LinkGroup  # noqa: E501

class Operations(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, link_groups=None):  # noqa: E501
        """Operations - a model defined in OpenAPI

        :param link_groups: The link_groups of this Operations.  # noqa: E501
        :type link_groups: List[LinkGroup]
        """
        self.openapi_types = {
            'link_groups': List[LinkGroup]
        }

        self.attribute_map = {
            'link_groups': 'linkGroups'
        }

        self._link_groups = link_groups

    @classmethod
    def from_dict(cls, dikt) -> 'Operations':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Operations of this Operations.  # noqa: E501
        :rtype: Operations
        """
        return util.deserialize_model(dikt, cls)

    @property
    def link_groups(self) -> List[LinkGroup]:
        """Gets the link_groups of this Operations.

        Details of the link groups defining issue operations.  # noqa: E501

        :return: The link_groups of this Operations.
        :rtype: List[LinkGroup]
        """
        return self._link_groups

    @link_groups.setter
    def link_groups(self, link_groups: List[LinkGroup]):
        """Sets the link_groups of this Operations.

        Details of the link groups defining issue operations.  # noqa: E501

        :param link_groups: The link_groups of this Operations.
        :type link_groups: List[LinkGroup]
        """

        self._link_groups = link_groups
