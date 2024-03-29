from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListUserPoliciesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, policy_names=None, is_truncated=None, marker=None):  # noqa: E501
        """ListUserPoliciesResponse - a model defined in OpenAPI

        :param policy_names: The policy_names of this ListUserPoliciesResponse.  # noqa: E501
        :type policy_names: List
        :param is_truncated: The is_truncated of this ListUserPoliciesResponse.  # noqa: E501
        :type is_truncated: bool
        :param marker: The marker of this ListUserPoliciesResponse.  # noqa: E501
        :type marker: str
        """
        self.openapi_types = {
            'policy_names': List,
            'is_truncated': bool,
            'marker': str
        }

        self.attribute_map = {
            'policy_names': 'PolicyNames',
            'is_truncated': 'IsTruncated',
            'marker': 'Marker'
        }

        self._policy_names = policy_names
        self._is_truncated = is_truncated
        self._marker = marker

    @classmethod
    def from_dict(cls, dikt) -> 'ListUserPoliciesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListUserPoliciesResponse of this ListUserPoliciesResponse.  # noqa: E501
        :rtype: ListUserPoliciesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def policy_names(self) -> List:
        """Gets the policy_names of this ListUserPoliciesResponse.


        :return: The policy_names of this ListUserPoliciesResponse.
        :rtype: List
        """
        return self._policy_names

    @policy_names.setter
    def policy_names(self, policy_names: List):
        """Sets the policy_names of this ListUserPoliciesResponse.


        :param policy_names: The policy_names of this ListUserPoliciesResponse.
        :type policy_names: List
        """
        if policy_names is None:
            raise ValueError("Invalid value for `policy_names`, must not be `None`")  # noqa: E501

        self._policy_names = policy_names

    @property
    def is_truncated(self) -> bool:
        """Gets the is_truncated of this ListUserPoliciesResponse.


        :return: The is_truncated of this ListUserPoliciesResponse.
        :rtype: bool
        """
        return self._is_truncated

    @is_truncated.setter
    def is_truncated(self, is_truncated: bool):
        """Sets the is_truncated of this ListUserPoliciesResponse.


        :param is_truncated: The is_truncated of this ListUserPoliciesResponse.
        :type is_truncated: bool
        """

        self._is_truncated = is_truncated

    @property
    def marker(self) -> str:
        """Gets the marker of this ListUserPoliciesResponse.


        :return: The marker of this ListUserPoliciesResponse.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListUserPoliciesResponse.


        :param marker: The marker of this ListUserPoliciesResponse.
        :type marker: str
        """

        self._marker = marker
