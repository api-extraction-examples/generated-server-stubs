from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListInstanceProfilesForRoleResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, instance_profiles=None, is_truncated=None, marker=None):  # noqa: E501
        """ListInstanceProfilesForRoleResponse - a model defined in OpenAPI

        :param instance_profiles: The instance_profiles of this ListInstanceProfilesForRoleResponse.  # noqa: E501
        :type instance_profiles: List
        :param is_truncated: The is_truncated of this ListInstanceProfilesForRoleResponse.  # noqa: E501
        :type is_truncated: bool
        :param marker: The marker of this ListInstanceProfilesForRoleResponse.  # noqa: E501
        :type marker: str
        """
        self.openapi_types = {
            'instance_profiles': List,
            'is_truncated': bool,
            'marker': str
        }

        self.attribute_map = {
            'instance_profiles': 'InstanceProfiles',
            'is_truncated': 'IsTruncated',
            'marker': 'Marker'
        }

        self._instance_profiles = instance_profiles
        self._is_truncated = is_truncated
        self._marker = marker

    @classmethod
    def from_dict(cls, dikt) -> 'ListInstanceProfilesForRoleResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListInstanceProfilesForRoleResponse of this ListInstanceProfilesForRoleResponse.  # noqa: E501
        :rtype: ListInstanceProfilesForRoleResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def instance_profiles(self) -> List:
        """Gets the instance_profiles of this ListInstanceProfilesForRoleResponse.


        :return: The instance_profiles of this ListInstanceProfilesForRoleResponse.
        :rtype: List
        """
        return self._instance_profiles

    @instance_profiles.setter
    def instance_profiles(self, instance_profiles: List):
        """Sets the instance_profiles of this ListInstanceProfilesForRoleResponse.


        :param instance_profiles: The instance_profiles of this ListInstanceProfilesForRoleResponse.
        :type instance_profiles: List
        """
        if instance_profiles is None:
            raise ValueError("Invalid value for `instance_profiles`, must not be `None`")  # noqa: E501

        self._instance_profiles = instance_profiles

    @property
    def is_truncated(self) -> bool:
        """Gets the is_truncated of this ListInstanceProfilesForRoleResponse.


        :return: The is_truncated of this ListInstanceProfilesForRoleResponse.
        :rtype: bool
        """
        return self._is_truncated

    @is_truncated.setter
    def is_truncated(self, is_truncated: bool):
        """Sets the is_truncated of this ListInstanceProfilesForRoleResponse.


        :param is_truncated: The is_truncated of this ListInstanceProfilesForRoleResponse.
        :type is_truncated: bool
        """

        self._is_truncated = is_truncated

    @property
    def marker(self) -> str:
        """Gets the marker of this ListInstanceProfilesForRoleResponse.


        :return: The marker of this ListInstanceProfilesForRoleResponse.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListInstanceProfilesForRoleResponse.


        :param marker: The marker of this ListInstanceProfilesForRoleResponse.
        :type marker: str
        """

        self._marker = marker