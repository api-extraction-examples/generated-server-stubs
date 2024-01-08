from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DeleteSAMLProviderRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, saml_provider_arn=None):  # noqa: E501
        """DeleteSAMLProviderRequest - a model defined in OpenAPI

        :param saml_provider_arn: The saml_provider_arn of this DeleteSAMLProviderRequest.  # noqa: E501
        :type saml_provider_arn: str
        """
        self.openapi_types = {
            'saml_provider_arn': str
        }

        self.attribute_map = {
            'saml_provider_arn': 'SAMLProviderArn'
        }

        self._saml_provider_arn = saml_provider_arn

    @classmethod
    def from_dict(cls, dikt) -> 'DeleteSAMLProviderRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DeleteSAMLProviderRequest of this DeleteSAMLProviderRequest.  # noqa: E501
        :rtype: DeleteSAMLProviderRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def saml_provider_arn(self) -> str:
        """Gets the saml_provider_arn of this DeleteSAMLProviderRequest.


        :return: The saml_provider_arn of this DeleteSAMLProviderRequest.
        :rtype: str
        """
        return self._saml_provider_arn

    @saml_provider_arn.setter
    def saml_provider_arn(self, saml_provider_arn: str):
        """Sets the saml_provider_arn of this DeleteSAMLProviderRequest.


        :param saml_provider_arn: The saml_provider_arn of this DeleteSAMLProviderRequest.
        :type saml_provider_arn: str
        """
        if saml_provider_arn is None:
            raise ValueError("Invalid value for `saml_provider_arn`, must not be `None`")  # noqa: E501

        self._saml_provider_arn = saml_provider_arn
