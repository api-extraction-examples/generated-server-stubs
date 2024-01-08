from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CreateSAMLProviderRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, saml_metadata_document=None, name=None, tags=None):  # noqa: E501
        """CreateSAMLProviderRequest - a model defined in OpenAPI

        :param saml_metadata_document: The saml_metadata_document of this CreateSAMLProviderRequest.  # noqa: E501
        :type saml_metadata_document: str
        :param name: The name of this CreateSAMLProviderRequest.  # noqa: E501
        :type name: str
        :param tags: The tags of this CreateSAMLProviderRequest.  # noqa: E501
        :type tags: List
        """
        self.openapi_types = {
            'saml_metadata_document': str,
            'name': str,
            'tags': List
        }

        self.attribute_map = {
            'saml_metadata_document': 'SAMLMetadataDocument',
            'name': 'Name',
            'tags': 'Tags'
        }

        self._saml_metadata_document = saml_metadata_document
        self._name = name
        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'CreateSAMLProviderRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateSAMLProviderRequest of this CreateSAMLProviderRequest.  # noqa: E501
        :rtype: CreateSAMLProviderRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def saml_metadata_document(self) -> str:
        """Gets the saml_metadata_document of this CreateSAMLProviderRequest.


        :return: The saml_metadata_document of this CreateSAMLProviderRequest.
        :rtype: str
        """
        return self._saml_metadata_document

    @saml_metadata_document.setter
    def saml_metadata_document(self, saml_metadata_document: str):
        """Sets the saml_metadata_document of this CreateSAMLProviderRequest.


        :param saml_metadata_document: The saml_metadata_document of this CreateSAMLProviderRequest.
        :type saml_metadata_document: str
        """
        if saml_metadata_document is None:
            raise ValueError("Invalid value for `saml_metadata_document`, must not be `None`")  # noqa: E501

        self._saml_metadata_document = saml_metadata_document

    @property
    def name(self) -> str:
        """Gets the name of this CreateSAMLProviderRequest.


        :return: The name of this CreateSAMLProviderRequest.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CreateSAMLProviderRequest.


        :param name: The name of this CreateSAMLProviderRequest.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def tags(self) -> List:
        """Gets the tags of this CreateSAMLProviderRequest.


        :return: The tags of this CreateSAMLProviderRequest.
        :rtype: List
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List):
        """Sets the tags of this CreateSAMLProviderRequest.


        :param tags: The tags of this CreateSAMLProviderRequest.
        :type tags: List
        """

        self._tags = tags