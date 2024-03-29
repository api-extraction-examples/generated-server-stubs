from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_encryption_declaration_state import AppEncryptionDeclarationState
from openapi_server.models.platform import Platform
from openapi_server import util

from openapi_server.models.app_encryption_declaration_state import AppEncryptionDeclarationState  # noqa: E501
from openapi_server.models.platform import Platform  # noqa: E501

class AppEncryptionDeclarationAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, app_encryption_declaration_state=None, available_on_french_store=None, code_value=None, contains_proprietary_cryptography=None, contains_third_party_cryptography=None, document_name=None, document_type=None, document_url=None, exempt=None, platform=None, uploaded_date=None, uses_encryption=None):  # noqa: E501
        """AppEncryptionDeclarationAttributes - a model defined in OpenAPI

        :param app_encryption_declaration_state: The app_encryption_declaration_state of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :type app_encryption_declaration_state: AppEncryptionDeclarationState
        :param available_on_french_store: The available_on_french_store of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :type available_on_french_store: bool
        :param code_value: The code_value of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :type code_value: str
        :param contains_proprietary_cryptography: The contains_proprietary_cryptography of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :type contains_proprietary_cryptography: bool
        :param contains_third_party_cryptography: The contains_third_party_cryptography of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :type contains_third_party_cryptography: bool
        :param document_name: The document_name of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :type document_name: str
        :param document_type: The document_type of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :type document_type: str
        :param document_url: The document_url of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :type document_url: str
        :param exempt: The exempt of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :type exempt: bool
        :param platform: The platform of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :type platform: Platform
        :param uploaded_date: The uploaded_date of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :type uploaded_date: datetime
        :param uses_encryption: The uses_encryption of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :type uses_encryption: bool
        """
        self.openapi_types = {
            'app_encryption_declaration_state': AppEncryptionDeclarationState,
            'available_on_french_store': bool,
            'code_value': str,
            'contains_proprietary_cryptography': bool,
            'contains_third_party_cryptography': bool,
            'document_name': str,
            'document_type': str,
            'document_url': str,
            'exempt': bool,
            'platform': Platform,
            'uploaded_date': datetime,
            'uses_encryption': bool
        }

        self.attribute_map = {
            'app_encryption_declaration_state': 'appEncryptionDeclarationState',
            'available_on_french_store': 'availableOnFrenchStore',
            'code_value': 'codeValue',
            'contains_proprietary_cryptography': 'containsProprietaryCryptography',
            'contains_third_party_cryptography': 'containsThirdPartyCryptography',
            'document_name': 'documentName',
            'document_type': 'documentType',
            'document_url': 'documentUrl',
            'exempt': 'exempt',
            'platform': 'platform',
            'uploaded_date': 'uploadedDate',
            'uses_encryption': 'usesEncryption'
        }

        self._app_encryption_declaration_state = app_encryption_declaration_state
        self._available_on_french_store = available_on_french_store
        self._code_value = code_value
        self._contains_proprietary_cryptography = contains_proprietary_cryptography
        self._contains_third_party_cryptography = contains_third_party_cryptography
        self._document_name = document_name
        self._document_type = document_type
        self._document_url = document_url
        self._exempt = exempt
        self._platform = platform
        self._uploaded_date = uploaded_date
        self._uses_encryption = uses_encryption

    @classmethod
    def from_dict(cls, dikt) -> 'AppEncryptionDeclarationAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppEncryptionDeclaration_attributes of this AppEncryptionDeclarationAttributes.  # noqa: E501
        :rtype: AppEncryptionDeclarationAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def app_encryption_declaration_state(self) -> AppEncryptionDeclarationState:
        """Gets the app_encryption_declaration_state of this AppEncryptionDeclarationAttributes.


        :return: The app_encryption_declaration_state of this AppEncryptionDeclarationAttributes.
        :rtype: AppEncryptionDeclarationState
        """
        return self._app_encryption_declaration_state

    @app_encryption_declaration_state.setter
    def app_encryption_declaration_state(self, app_encryption_declaration_state: AppEncryptionDeclarationState):
        """Sets the app_encryption_declaration_state of this AppEncryptionDeclarationAttributes.


        :param app_encryption_declaration_state: The app_encryption_declaration_state of this AppEncryptionDeclarationAttributes.
        :type app_encryption_declaration_state: AppEncryptionDeclarationState
        """

        self._app_encryption_declaration_state = app_encryption_declaration_state

    @property
    def available_on_french_store(self) -> bool:
        """Gets the available_on_french_store of this AppEncryptionDeclarationAttributes.


        :return: The available_on_french_store of this AppEncryptionDeclarationAttributes.
        :rtype: bool
        """
        return self._available_on_french_store

    @available_on_french_store.setter
    def available_on_french_store(self, available_on_french_store: bool):
        """Sets the available_on_french_store of this AppEncryptionDeclarationAttributes.


        :param available_on_french_store: The available_on_french_store of this AppEncryptionDeclarationAttributes.
        :type available_on_french_store: bool
        """

        self._available_on_french_store = available_on_french_store

    @property
    def code_value(self) -> str:
        """Gets the code_value of this AppEncryptionDeclarationAttributes.


        :return: The code_value of this AppEncryptionDeclarationAttributes.
        :rtype: str
        """
        return self._code_value

    @code_value.setter
    def code_value(self, code_value: str):
        """Sets the code_value of this AppEncryptionDeclarationAttributes.


        :param code_value: The code_value of this AppEncryptionDeclarationAttributes.
        :type code_value: str
        """

        self._code_value = code_value

    @property
    def contains_proprietary_cryptography(self) -> bool:
        """Gets the contains_proprietary_cryptography of this AppEncryptionDeclarationAttributes.


        :return: The contains_proprietary_cryptography of this AppEncryptionDeclarationAttributes.
        :rtype: bool
        """
        return self._contains_proprietary_cryptography

    @contains_proprietary_cryptography.setter
    def contains_proprietary_cryptography(self, contains_proprietary_cryptography: bool):
        """Sets the contains_proprietary_cryptography of this AppEncryptionDeclarationAttributes.


        :param contains_proprietary_cryptography: The contains_proprietary_cryptography of this AppEncryptionDeclarationAttributes.
        :type contains_proprietary_cryptography: bool
        """

        self._contains_proprietary_cryptography = contains_proprietary_cryptography

    @property
    def contains_third_party_cryptography(self) -> bool:
        """Gets the contains_third_party_cryptography of this AppEncryptionDeclarationAttributes.


        :return: The contains_third_party_cryptography of this AppEncryptionDeclarationAttributes.
        :rtype: bool
        """
        return self._contains_third_party_cryptography

    @contains_third_party_cryptography.setter
    def contains_third_party_cryptography(self, contains_third_party_cryptography: bool):
        """Sets the contains_third_party_cryptography of this AppEncryptionDeclarationAttributes.


        :param contains_third_party_cryptography: The contains_third_party_cryptography of this AppEncryptionDeclarationAttributes.
        :type contains_third_party_cryptography: bool
        """

        self._contains_third_party_cryptography = contains_third_party_cryptography

    @property
    def document_name(self) -> str:
        """Gets the document_name of this AppEncryptionDeclarationAttributes.


        :return: The document_name of this AppEncryptionDeclarationAttributes.
        :rtype: str
        """
        return self._document_name

    @document_name.setter
    def document_name(self, document_name: str):
        """Sets the document_name of this AppEncryptionDeclarationAttributes.


        :param document_name: The document_name of this AppEncryptionDeclarationAttributes.
        :type document_name: str
        """

        self._document_name = document_name

    @property
    def document_type(self) -> str:
        """Gets the document_type of this AppEncryptionDeclarationAttributes.


        :return: The document_type of this AppEncryptionDeclarationAttributes.
        :rtype: str
        """
        return self._document_type

    @document_type.setter
    def document_type(self, document_type: str):
        """Sets the document_type of this AppEncryptionDeclarationAttributes.


        :param document_type: The document_type of this AppEncryptionDeclarationAttributes.
        :type document_type: str
        """

        self._document_type = document_type

    @property
    def document_url(self) -> str:
        """Gets the document_url of this AppEncryptionDeclarationAttributes.


        :return: The document_url of this AppEncryptionDeclarationAttributes.
        :rtype: str
        """
        return self._document_url

    @document_url.setter
    def document_url(self, document_url: str):
        """Sets the document_url of this AppEncryptionDeclarationAttributes.


        :param document_url: The document_url of this AppEncryptionDeclarationAttributes.
        :type document_url: str
        """

        self._document_url = document_url

    @property
    def exempt(self) -> bool:
        """Gets the exempt of this AppEncryptionDeclarationAttributes.


        :return: The exempt of this AppEncryptionDeclarationAttributes.
        :rtype: bool
        """
        return self._exempt

    @exempt.setter
    def exempt(self, exempt: bool):
        """Sets the exempt of this AppEncryptionDeclarationAttributes.


        :param exempt: The exempt of this AppEncryptionDeclarationAttributes.
        :type exempt: bool
        """

        self._exempt = exempt

    @property
    def platform(self) -> Platform:
        """Gets the platform of this AppEncryptionDeclarationAttributes.


        :return: The platform of this AppEncryptionDeclarationAttributes.
        :rtype: Platform
        """
        return self._platform

    @platform.setter
    def platform(self, platform: Platform):
        """Sets the platform of this AppEncryptionDeclarationAttributes.


        :param platform: The platform of this AppEncryptionDeclarationAttributes.
        :type platform: Platform
        """

        self._platform = platform

    @property
    def uploaded_date(self) -> datetime:
        """Gets the uploaded_date of this AppEncryptionDeclarationAttributes.


        :return: The uploaded_date of this AppEncryptionDeclarationAttributes.
        :rtype: datetime
        """
        return self._uploaded_date

    @uploaded_date.setter
    def uploaded_date(self, uploaded_date: datetime):
        """Sets the uploaded_date of this AppEncryptionDeclarationAttributes.


        :param uploaded_date: The uploaded_date of this AppEncryptionDeclarationAttributes.
        :type uploaded_date: datetime
        """

        self._uploaded_date = uploaded_date

    @property
    def uses_encryption(self) -> bool:
        """Gets the uses_encryption of this AppEncryptionDeclarationAttributes.


        :return: The uses_encryption of this AppEncryptionDeclarationAttributes.
        :rtype: bool
        """
        return self._uses_encryption

    @uses_encryption.setter
    def uses_encryption(self, uses_encryption: bool):
        """Sets the uses_encryption of this AppEncryptionDeclarationAttributes.


        :param uses_encryption: The uses_encryption of this AppEncryptionDeclarationAttributes.
        :type uses_encryption: bool
        """

        self._uses_encryption = uses_encryption
