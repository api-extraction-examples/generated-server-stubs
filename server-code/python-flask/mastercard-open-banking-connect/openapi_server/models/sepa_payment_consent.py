from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SepaPaymentConsent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, consent_id=None, consent_request_id=None):  # noqa: E501
        """SepaPaymentConsent - a model defined in OpenAPI

        :param consent_id: The consent_id of this SepaPaymentConsent.  # noqa: E501
        :type consent_id: str
        :param consent_request_id: The consent_request_id of this SepaPaymentConsent.  # noqa: E501
        :type consent_request_id: str
        """
        self.openapi_types = {
            'consent_id': str,
            'consent_request_id': str
        }

        self.attribute_map = {
            'consent_id': 'consentId',
            'consent_request_id': 'consentRequestId'
        }

        self._consent_id = consent_id
        self._consent_request_id = consent_request_id

    @classmethod
    def from_dict(cls, dikt) -> 'SepaPaymentConsent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SepaPaymentConsent of this SepaPaymentConsent.  # noqa: E501
        :rtype: SepaPaymentConsent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def consent_id(self) -> str:
        """Gets the consent_id of this SepaPaymentConsent.

        Consent Id  # noqa: E501

        :return: The consent_id of this SepaPaymentConsent.
        :rtype: str
        """
        return self._consent_id

    @consent_id.setter
    def consent_id(self, consent_id: str):
        """Sets the consent_id of this SepaPaymentConsent.

        Consent Id  # noqa: E501

        :param consent_id: The consent_id of this SepaPaymentConsent.
        :type consent_id: str
        """
        if consent_id is None:
            raise ValueError("Invalid value for `consent_id`, must not be `None`")  # noqa: E501

        self._consent_id = consent_id

    @property
    def consent_request_id(self) -> str:
        """Gets the consent_request_id of this SepaPaymentConsent.

        Consent Request Id, the same as received from /consent operations.  # noqa: E501

        :return: The consent_request_id of this SepaPaymentConsent.
        :rtype: str
        """
        return self._consent_request_id

    @consent_request_id.setter
    def consent_request_id(self, consent_request_id: str):
        """Sets the consent_request_id of this SepaPaymentConsent.

        Consent Request Id, the same as received from /consent operations.  # noqa: E501

        :param consent_request_id: The consent_request_id of this SepaPaymentConsent.
        :type consent_request_id: str
        """
        if consent_request_id is None:
            raise ValueError("Invalid value for `consent_request_id`, must not be `None`")  # noqa: E501

        self._consent_request_id = consent_request_id