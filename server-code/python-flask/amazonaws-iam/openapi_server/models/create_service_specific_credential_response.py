from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.create_service_specific_credential_response_service_specific_credential import CreateServiceSpecificCredentialResponseServiceSpecificCredential
from openapi_server import util

from openapi_server.models.create_service_specific_credential_response_service_specific_credential import CreateServiceSpecificCredentialResponseServiceSpecificCredential  # noqa: E501

class CreateServiceSpecificCredentialResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, service_specific_credential=None):  # noqa: E501
        """CreateServiceSpecificCredentialResponse - a model defined in OpenAPI

        :param service_specific_credential: The service_specific_credential of this CreateServiceSpecificCredentialResponse.  # noqa: E501
        :type service_specific_credential: CreateServiceSpecificCredentialResponseServiceSpecificCredential
        """
        self.openapi_types = {
            'service_specific_credential': CreateServiceSpecificCredentialResponseServiceSpecificCredential
        }

        self.attribute_map = {
            'service_specific_credential': 'ServiceSpecificCredential'
        }

        self._service_specific_credential = service_specific_credential

    @classmethod
    def from_dict(cls, dikt) -> 'CreateServiceSpecificCredentialResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateServiceSpecificCredentialResponse of this CreateServiceSpecificCredentialResponse.  # noqa: E501
        :rtype: CreateServiceSpecificCredentialResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def service_specific_credential(self) -> CreateServiceSpecificCredentialResponseServiceSpecificCredential:
        """Gets the service_specific_credential of this CreateServiceSpecificCredentialResponse.


        :return: The service_specific_credential of this CreateServiceSpecificCredentialResponse.
        :rtype: CreateServiceSpecificCredentialResponseServiceSpecificCredential
        """
        return self._service_specific_credential

    @service_specific_credential.setter
    def service_specific_credential(self, service_specific_credential: CreateServiceSpecificCredentialResponseServiceSpecificCredential):
        """Sets the service_specific_credential of this CreateServiceSpecificCredentialResponse.


        :param service_specific_credential: The service_specific_credential of this CreateServiceSpecificCredentialResponse.
        :type service_specific_credential: CreateServiceSpecificCredentialResponseServiceSpecificCredential
        """

        self._service_specific_credential = service_specific_credential
