from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListServiceSpecificCredentialsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, service_specific_credentials=None):  # noqa: E501
        """ListServiceSpecificCredentialsResponse - a model defined in OpenAPI

        :param service_specific_credentials: The service_specific_credentials of this ListServiceSpecificCredentialsResponse.  # noqa: E501
        :type service_specific_credentials: List
        """
        self.openapi_types = {
            'service_specific_credentials': List
        }

        self.attribute_map = {
            'service_specific_credentials': 'ServiceSpecificCredentials'
        }

        self._service_specific_credentials = service_specific_credentials

    @classmethod
    def from_dict(cls, dikt) -> 'ListServiceSpecificCredentialsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListServiceSpecificCredentialsResponse of this ListServiceSpecificCredentialsResponse.  # noqa: E501
        :rtype: ListServiceSpecificCredentialsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def service_specific_credentials(self) -> List:
        """Gets the service_specific_credentials of this ListServiceSpecificCredentialsResponse.


        :return: The service_specific_credentials of this ListServiceSpecificCredentialsResponse.
        :rtype: List
        """
        return self._service_specific_credentials

    @service_specific_credentials.setter
    def service_specific_credentials(self, service_specific_credentials: List):
        """Sets the service_specific_credentials of this ListServiceSpecificCredentialsResponse.


        :param service_specific_credentials: The service_specific_credentials of this ListServiceSpecificCredentialsResponse.
        :type service_specific_credentials: List
        """

        self._service_specific_credentials = service_specific_credentials
