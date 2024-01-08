from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GetPolicyVersionResponsePolicyVersion(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, document=None, version_id=None, is_default_version=None, create_date=None):  # noqa: E501
        """GetPolicyVersionResponsePolicyVersion - a model defined in OpenAPI

        :param document: The document of this GetPolicyVersionResponsePolicyVersion.  # noqa: E501
        :type document: str
        :param version_id: The version_id of this GetPolicyVersionResponsePolicyVersion.  # noqa: E501
        :type version_id: str
        :param is_default_version: The is_default_version of this GetPolicyVersionResponsePolicyVersion.  # noqa: E501
        :type is_default_version: bool
        :param create_date: The create_date of this GetPolicyVersionResponsePolicyVersion.  # noqa: E501
        :type create_date: datetime
        """
        self.openapi_types = {
            'document': str,
            'version_id': str,
            'is_default_version': bool,
            'create_date': datetime
        }

        self.attribute_map = {
            'document': 'Document',
            'version_id': 'VersionId',
            'is_default_version': 'IsDefaultVersion',
            'create_date': 'CreateDate'
        }

        self._document = document
        self._version_id = version_id
        self._is_default_version = is_default_version
        self._create_date = create_date

    @classmethod
    def from_dict(cls, dikt) -> 'GetPolicyVersionResponsePolicyVersion':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetPolicyVersionResponse_PolicyVersion of this GetPolicyVersionResponsePolicyVersion.  # noqa: E501
        :rtype: GetPolicyVersionResponsePolicyVersion
        """
        return util.deserialize_model(dikt, cls)

    @property
    def document(self) -> str:
        """Gets the document of this GetPolicyVersionResponsePolicyVersion.


        :return: The document of this GetPolicyVersionResponsePolicyVersion.
        :rtype: str
        """
        return self._document

    @document.setter
    def document(self, document: str):
        """Sets the document of this GetPolicyVersionResponsePolicyVersion.


        :param document: The document of this GetPolicyVersionResponsePolicyVersion.
        :type document: str
        """

        self._document = document

    @property
    def version_id(self) -> str:
        """Gets the version_id of this GetPolicyVersionResponsePolicyVersion.


        :return: The version_id of this GetPolicyVersionResponsePolicyVersion.
        :rtype: str
        """
        return self._version_id

    @version_id.setter
    def version_id(self, version_id: str):
        """Sets the version_id of this GetPolicyVersionResponsePolicyVersion.


        :param version_id: The version_id of this GetPolicyVersionResponsePolicyVersion.
        :type version_id: str
        """

        self._version_id = version_id

    @property
    def is_default_version(self) -> bool:
        """Gets the is_default_version of this GetPolicyVersionResponsePolicyVersion.


        :return: The is_default_version of this GetPolicyVersionResponsePolicyVersion.
        :rtype: bool
        """
        return self._is_default_version

    @is_default_version.setter
    def is_default_version(self, is_default_version: bool):
        """Sets the is_default_version of this GetPolicyVersionResponsePolicyVersion.


        :param is_default_version: The is_default_version of this GetPolicyVersionResponsePolicyVersion.
        :type is_default_version: bool
        """

        self._is_default_version = is_default_version

    @property
    def create_date(self) -> datetime:
        """Gets the create_date of this GetPolicyVersionResponsePolicyVersion.


        :return: The create_date of this GetPolicyVersionResponsePolicyVersion.
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date: datetime):
        """Sets the create_date of this GetPolicyVersionResponsePolicyVersion.


        :param create_date: The create_date of this GetPolicyVersionResponsePolicyVersion.
        :type create_date: datetime
        """

        self._create_date = create_date
