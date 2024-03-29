from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListPoliciesGrantingServiceAccessRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, marker=None, arn=None, service_namespaces=None):  # noqa: E501
        """ListPoliciesGrantingServiceAccessRequest - a model defined in OpenAPI

        :param marker: The marker of this ListPoliciesGrantingServiceAccessRequest.  # noqa: E501
        :type marker: str
        :param arn: The arn of this ListPoliciesGrantingServiceAccessRequest.  # noqa: E501
        :type arn: str
        :param service_namespaces: The service_namespaces of this ListPoliciesGrantingServiceAccessRequest.  # noqa: E501
        :type service_namespaces: List
        """
        self.openapi_types = {
            'marker': str,
            'arn': str,
            'service_namespaces': List
        }

        self.attribute_map = {
            'marker': 'Marker',
            'arn': 'Arn',
            'service_namespaces': 'ServiceNamespaces'
        }

        self._marker = marker
        self._arn = arn
        self._service_namespaces = service_namespaces

    @classmethod
    def from_dict(cls, dikt) -> 'ListPoliciesGrantingServiceAccessRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListPoliciesGrantingServiceAccessRequest of this ListPoliciesGrantingServiceAccessRequest.  # noqa: E501
        :rtype: ListPoliciesGrantingServiceAccessRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def marker(self) -> str:
        """Gets the marker of this ListPoliciesGrantingServiceAccessRequest.


        :return: The marker of this ListPoliciesGrantingServiceAccessRequest.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListPoliciesGrantingServiceAccessRequest.


        :param marker: The marker of this ListPoliciesGrantingServiceAccessRequest.
        :type marker: str
        """

        self._marker = marker

    @property
    def arn(self) -> str:
        """Gets the arn of this ListPoliciesGrantingServiceAccessRequest.


        :return: The arn of this ListPoliciesGrantingServiceAccessRequest.
        :rtype: str
        """
        return self._arn

    @arn.setter
    def arn(self, arn: str):
        """Sets the arn of this ListPoliciesGrantingServiceAccessRequest.


        :param arn: The arn of this ListPoliciesGrantingServiceAccessRequest.
        :type arn: str
        """
        if arn is None:
            raise ValueError("Invalid value for `arn`, must not be `None`")  # noqa: E501

        self._arn = arn

    @property
    def service_namespaces(self) -> List:
        """Gets the service_namespaces of this ListPoliciesGrantingServiceAccessRequest.


        :return: The service_namespaces of this ListPoliciesGrantingServiceAccessRequest.
        :rtype: List
        """
        return self._service_namespaces

    @service_namespaces.setter
    def service_namespaces(self, service_namespaces: List):
        """Sets the service_namespaces of this ListPoliciesGrantingServiceAccessRequest.


        :param service_namespaces: The service_namespaces of this ListPoliciesGrantingServiceAccessRequest.
        :type service_namespaces: List
        """
        if service_namespaces is None:
            raise ValueError("Invalid value for `service_namespaces`, must not be `None`")  # noqa: E501

        self._service_namespaces = service_namespaces
