from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class RoleDetailRoleLastUsed(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, last_used_date=None, region=None):  # noqa: E501
        """RoleDetailRoleLastUsed - a model defined in OpenAPI

        :param last_used_date: The last_used_date of this RoleDetailRoleLastUsed.  # noqa: E501
        :type last_used_date: datetime
        :param region: The region of this RoleDetailRoleLastUsed.  # noqa: E501
        :type region: str
        """
        self.openapi_types = {
            'last_used_date': datetime,
            'region': str
        }

        self.attribute_map = {
            'last_used_date': 'LastUsedDate',
            'region': 'Region'
        }

        self._last_used_date = last_used_date
        self._region = region

    @classmethod
    def from_dict(cls, dikt) -> 'RoleDetailRoleLastUsed':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RoleDetail_RoleLastUsed of this RoleDetailRoleLastUsed.  # noqa: E501
        :rtype: RoleDetailRoleLastUsed
        """
        return util.deserialize_model(dikt, cls)

    @property
    def last_used_date(self) -> datetime:
        """Gets the last_used_date of this RoleDetailRoleLastUsed.


        :return: The last_used_date of this RoleDetailRoleLastUsed.
        :rtype: datetime
        """
        return self._last_used_date

    @last_used_date.setter
    def last_used_date(self, last_used_date: datetime):
        """Sets the last_used_date of this RoleDetailRoleLastUsed.


        :param last_used_date: The last_used_date of this RoleDetailRoleLastUsed.
        :type last_used_date: datetime
        """

        self._last_used_date = last_used_date

    @property
    def region(self) -> str:
        """Gets the region of this RoleDetailRoleLastUsed.


        :return: The region of this RoleDetailRoleLastUsed.
        :rtype: str
        """
        return self._region

    @region.setter
    def region(self, region: str):
        """Sets the region of this RoleDetailRoleLastUsed.


        :param region: The region of this RoleDetailRoleLastUsed.
        :type region: str
        """

        self._region = region
