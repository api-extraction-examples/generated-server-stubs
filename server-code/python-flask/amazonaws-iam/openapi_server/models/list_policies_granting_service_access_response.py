from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListPoliciesGrantingServiceAccessResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, policies_granting_service_access=None, is_truncated=None, marker=None):  # noqa: E501
        """ListPoliciesGrantingServiceAccessResponse - a model defined in OpenAPI

        :param policies_granting_service_access: The policies_granting_service_access of this ListPoliciesGrantingServiceAccessResponse.  # noqa: E501
        :type policies_granting_service_access: List
        :param is_truncated: The is_truncated of this ListPoliciesGrantingServiceAccessResponse.  # noqa: E501
        :type is_truncated: bool
        :param marker: The marker of this ListPoliciesGrantingServiceAccessResponse.  # noqa: E501
        :type marker: str
        """
        self.openapi_types = {
            'policies_granting_service_access': List,
            'is_truncated': bool,
            'marker': str
        }

        self.attribute_map = {
            'policies_granting_service_access': 'PoliciesGrantingServiceAccess',
            'is_truncated': 'IsTruncated',
            'marker': 'Marker'
        }

        self._policies_granting_service_access = policies_granting_service_access
        self._is_truncated = is_truncated
        self._marker = marker

    @classmethod
    def from_dict(cls, dikt) -> 'ListPoliciesGrantingServiceAccessResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListPoliciesGrantingServiceAccessResponse of this ListPoliciesGrantingServiceAccessResponse.  # noqa: E501
        :rtype: ListPoliciesGrantingServiceAccessResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def policies_granting_service_access(self) -> List:
        """Gets the policies_granting_service_access of this ListPoliciesGrantingServiceAccessResponse.


        :return: The policies_granting_service_access of this ListPoliciesGrantingServiceAccessResponse.
        :rtype: List
        """
        return self._policies_granting_service_access

    @policies_granting_service_access.setter
    def policies_granting_service_access(self, policies_granting_service_access: List):
        """Sets the policies_granting_service_access of this ListPoliciesGrantingServiceAccessResponse.


        :param policies_granting_service_access: The policies_granting_service_access of this ListPoliciesGrantingServiceAccessResponse.
        :type policies_granting_service_access: List
        """
        if policies_granting_service_access is None:
            raise ValueError("Invalid value for `policies_granting_service_access`, must not be `None`")  # noqa: E501

        self._policies_granting_service_access = policies_granting_service_access

    @property
    def is_truncated(self) -> bool:
        """Gets the is_truncated of this ListPoliciesGrantingServiceAccessResponse.


        :return: The is_truncated of this ListPoliciesGrantingServiceAccessResponse.
        :rtype: bool
        """
        return self._is_truncated

    @is_truncated.setter
    def is_truncated(self, is_truncated: bool):
        """Sets the is_truncated of this ListPoliciesGrantingServiceAccessResponse.


        :param is_truncated: The is_truncated of this ListPoliciesGrantingServiceAccessResponse.
        :type is_truncated: bool
        """

        self._is_truncated = is_truncated

    @property
    def marker(self) -> str:
        """Gets the marker of this ListPoliciesGrantingServiceAccessResponse.


        :return: The marker of this ListPoliciesGrantingServiceAccessResponse.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListPoliciesGrantingServiceAccessResponse.


        :param marker: The marker of this ListPoliciesGrantingServiceAccessResponse.
        :type marker: str
        """

        self._marker = marker