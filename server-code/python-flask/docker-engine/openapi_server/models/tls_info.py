from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TLSInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, cert_issuer_public_key=None, cert_issuer_subject=None, trust_root=None):  # noqa: E501
        """TLSInfo - a model defined in OpenAPI

        :param cert_issuer_public_key: The cert_issuer_public_key of this TLSInfo.  # noqa: E501
        :type cert_issuer_public_key: str
        :param cert_issuer_subject: The cert_issuer_subject of this TLSInfo.  # noqa: E501
        :type cert_issuer_subject: str
        :param trust_root: The trust_root of this TLSInfo.  # noqa: E501
        :type trust_root: str
        """
        self.openapi_types = {
            'cert_issuer_public_key': str,
            'cert_issuer_subject': str,
            'trust_root': str
        }

        self.attribute_map = {
            'cert_issuer_public_key': 'CertIssuerPublicKey',
            'cert_issuer_subject': 'CertIssuerSubject',
            'trust_root': 'TrustRoot'
        }

        self._cert_issuer_public_key = cert_issuer_public_key
        self._cert_issuer_subject = cert_issuer_subject
        self._trust_root = trust_root

    @classmethod
    def from_dict(cls, dikt) -> 'TLSInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TLSInfo of this TLSInfo.  # noqa: E501
        :rtype: TLSInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cert_issuer_public_key(self) -> str:
        """Gets the cert_issuer_public_key of this TLSInfo.

        The base64-url-safe-encoded raw public key bytes of the issuer  # noqa: E501

        :return: The cert_issuer_public_key of this TLSInfo.
        :rtype: str
        """
        return self._cert_issuer_public_key

    @cert_issuer_public_key.setter
    def cert_issuer_public_key(self, cert_issuer_public_key: str):
        """Sets the cert_issuer_public_key of this TLSInfo.

        The base64-url-safe-encoded raw public key bytes of the issuer  # noqa: E501

        :param cert_issuer_public_key: The cert_issuer_public_key of this TLSInfo.
        :type cert_issuer_public_key: str
        """

        self._cert_issuer_public_key = cert_issuer_public_key

    @property
    def cert_issuer_subject(self) -> str:
        """Gets the cert_issuer_subject of this TLSInfo.

        The base64-url-safe-encoded raw subject bytes of the issuer  # noqa: E501

        :return: The cert_issuer_subject of this TLSInfo.
        :rtype: str
        """
        return self._cert_issuer_subject

    @cert_issuer_subject.setter
    def cert_issuer_subject(self, cert_issuer_subject: str):
        """Sets the cert_issuer_subject of this TLSInfo.

        The base64-url-safe-encoded raw subject bytes of the issuer  # noqa: E501

        :param cert_issuer_subject: The cert_issuer_subject of this TLSInfo.
        :type cert_issuer_subject: str
        """

        self._cert_issuer_subject = cert_issuer_subject

    @property
    def trust_root(self) -> str:
        """Gets the trust_root of this TLSInfo.

        The root CA certificate(s) that are used to validate leaf TLS certificates  # noqa: E501

        :return: The trust_root of this TLSInfo.
        :rtype: str
        """
        return self._trust_root

    @trust_root.setter
    def trust_root(self, trust_root: str):
        """Sets the trust_root of this TLSInfo.

        The root CA certificate(s) that are used to validate leaf TLS certificates  # noqa: E501

        :param trust_root: The trust_root of this TLSInfo.
        :type trust_root: str
        """

        self._trust_root = trust_root
