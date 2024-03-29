from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GetSAMLProviderResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, saml_metadata_document=None, create_date=None, valid_until=None, tags=None):  # noqa: E501
        """GetSAMLProviderResponse - a model defined in OpenAPI

        :param saml_metadata_document: The saml_metadata_document of this GetSAMLProviderResponse.  # noqa: E501
        :type saml_metadata_document: str
        :param create_date: The create_date of this GetSAMLProviderResponse.  # noqa: E501
        :type create_date: datetime
        :param valid_until: The valid_until of this GetSAMLProviderResponse.  # noqa: E501
        :type valid_until: datetime
        :param tags: The tags of this GetSAMLProviderResponse.  # noqa: E501
        :type tags: List
        """
        self.openapi_types = {
            'saml_metadata_document': str,
            'create_date': datetime,
            'valid_until': datetime,
            'tags': List
        }

        self.attribute_map = {
            'saml_metadata_document': 'SAMLMetadataDocument',
            'create_date': 'CreateDate',
            'valid_until': 'ValidUntil',
            'tags': 'Tags'
        }

        self._saml_metadata_document = saml_metadata_document
        self._create_date = create_date
        self._valid_until = valid_until
        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'GetSAMLProviderResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetSAMLProviderResponse of this GetSAMLProviderResponse.  # noqa: E501
        :rtype: GetSAMLProviderResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def saml_metadata_document(self) -> str:
        """Gets the saml_metadata_document of this GetSAMLProviderResponse.


        :return: The saml_metadata_document of this GetSAMLProviderResponse.
        :rtype: str
        """
        return self._saml_metadata_document

    @saml_metadata_document.setter
    def saml_metadata_document(self, saml_metadata_document: str):
        """Sets the saml_metadata_document of this GetSAMLProviderResponse.


        :param saml_metadata_document: The saml_metadata_document of this GetSAMLProviderResponse.
        :type saml_metadata_document: str
        """

        self._saml_metadata_document = saml_metadata_document

    @property
    def create_date(self) -> datetime:
        """Gets the create_date of this GetSAMLProviderResponse.


        :return: The create_date of this GetSAMLProviderResponse.
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date: datetime):
        """Sets the create_date of this GetSAMLProviderResponse.


        :param create_date: The create_date of this GetSAMLProviderResponse.
        :type create_date: datetime
        """

        self._create_date = create_date

    @property
    def valid_until(self) -> datetime:
        """Gets the valid_until of this GetSAMLProviderResponse.


        :return: The valid_until of this GetSAMLProviderResponse.
        :rtype: datetime
        """
        return self._valid_until

    @valid_until.setter
    def valid_until(self, valid_until: datetime):
        """Sets the valid_until of this GetSAMLProviderResponse.


        :param valid_until: The valid_until of this GetSAMLProviderResponse.
        :type valid_until: datetime
        """

        self._valid_until = valid_until

    @property
    def tags(self) -> List:
        """Gets the tags of this GetSAMLProviderResponse.


        :return: The tags of this GetSAMLProviderResponse.
        :rtype: List
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List):
        """Sets the tags of this GetSAMLProviderResponse.


        :param tags: The tags of this GetSAMLProviderResponse.
        :type tags: List
        """

        self._tags = tags
