from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.swarm_spec_ca_config_external_cas_inner import SwarmSpecCAConfigExternalCAsInner
from openapi_server import util

from openapi_server.models.swarm_spec_ca_config_external_cas_inner import SwarmSpecCAConfigExternalCAsInner  # noqa: E501

class SwarmSpecCAConfig(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, external_cas=None, force_rotate=None, node_cert_expiry=None, signing_ca_cert=None, signing_ca_key=None):  # noqa: E501
        """SwarmSpecCAConfig - a model defined in OpenAPI

        :param external_cas: The external_cas of this SwarmSpecCAConfig.  # noqa: E501
        :type external_cas: List[SwarmSpecCAConfigExternalCAsInner]
        :param force_rotate: The force_rotate of this SwarmSpecCAConfig.  # noqa: E501
        :type force_rotate: int
        :param node_cert_expiry: The node_cert_expiry of this SwarmSpecCAConfig.  # noqa: E501
        :type node_cert_expiry: int
        :param signing_ca_cert: The signing_ca_cert of this SwarmSpecCAConfig.  # noqa: E501
        :type signing_ca_cert: str
        :param signing_ca_key: The signing_ca_key of this SwarmSpecCAConfig.  # noqa: E501
        :type signing_ca_key: str
        """
        self.openapi_types = {
            'external_cas': List[SwarmSpecCAConfigExternalCAsInner],
            'force_rotate': int,
            'node_cert_expiry': int,
            'signing_ca_cert': str,
            'signing_ca_key': str
        }

        self.attribute_map = {
            'external_cas': 'ExternalCAs',
            'force_rotate': 'ForceRotate',
            'node_cert_expiry': 'NodeCertExpiry',
            'signing_ca_cert': 'SigningCACert',
            'signing_ca_key': 'SigningCAKey'
        }

        self._external_cas = external_cas
        self._force_rotate = force_rotate
        self._node_cert_expiry = node_cert_expiry
        self._signing_ca_cert = signing_ca_cert
        self._signing_ca_key = signing_ca_key

    @classmethod
    def from_dict(cls, dikt) -> 'SwarmSpecCAConfig':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SwarmSpec_CAConfig of this SwarmSpecCAConfig.  # noqa: E501
        :rtype: SwarmSpecCAConfig
        """
        return util.deserialize_model(dikt, cls)

    @property
    def external_cas(self) -> List[SwarmSpecCAConfigExternalCAsInner]:
        """Gets the external_cas of this SwarmSpecCAConfig.

        Configuration for forwarding signing requests to an external certificate authority.  # noqa: E501

        :return: The external_cas of this SwarmSpecCAConfig.
        :rtype: List[SwarmSpecCAConfigExternalCAsInner]
        """
        return self._external_cas

    @external_cas.setter
    def external_cas(self, external_cas: List[SwarmSpecCAConfigExternalCAsInner]):
        """Sets the external_cas of this SwarmSpecCAConfig.

        Configuration for forwarding signing requests to an external certificate authority.  # noqa: E501

        :param external_cas: The external_cas of this SwarmSpecCAConfig.
        :type external_cas: List[SwarmSpecCAConfigExternalCAsInner]
        """

        self._external_cas = external_cas

    @property
    def force_rotate(self) -> int:
        """Gets the force_rotate of this SwarmSpecCAConfig.

        An integer whose purpose is to force swarm to generate a new signing CA certificate and key, if none have been specified in `SigningCACert` and `SigningCAKey`  # noqa: E501

        :return: The force_rotate of this SwarmSpecCAConfig.
        :rtype: int
        """
        return self._force_rotate

    @force_rotate.setter
    def force_rotate(self, force_rotate: int):
        """Sets the force_rotate of this SwarmSpecCAConfig.

        An integer whose purpose is to force swarm to generate a new signing CA certificate and key, if none have been specified in `SigningCACert` and `SigningCAKey`  # noqa: E501

        :param force_rotate: The force_rotate of this SwarmSpecCAConfig.
        :type force_rotate: int
        """

        self._force_rotate = force_rotate

    @property
    def node_cert_expiry(self) -> int:
        """Gets the node_cert_expiry of this SwarmSpecCAConfig.

        The duration node certificates are issued for.  # noqa: E501

        :return: The node_cert_expiry of this SwarmSpecCAConfig.
        :rtype: int
        """
        return self._node_cert_expiry

    @node_cert_expiry.setter
    def node_cert_expiry(self, node_cert_expiry: int):
        """Sets the node_cert_expiry of this SwarmSpecCAConfig.

        The duration node certificates are issued for.  # noqa: E501

        :param node_cert_expiry: The node_cert_expiry of this SwarmSpecCAConfig.
        :type node_cert_expiry: int
        """

        self._node_cert_expiry = node_cert_expiry

    @property
    def signing_ca_cert(self) -> str:
        """Gets the signing_ca_cert of this SwarmSpecCAConfig.

        The desired signing CA certificate for all swarm node TLS leaf certificates, in PEM format.  # noqa: E501

        :return: The signing_ca_cert of this SwarmSpecCAConfig.
        :rtype: str
        """
        return self._signing_ca_cert

    @signing_ca_cert.setter
    def signing_ca_cert(self, signing_ca_cert: str):
        """Sets the signing_ca_cert of this SwarmSpecCAConfig.

        The desired signing CA certificate for all swarm node TLS leaf certificates, in PEM format.  # noqa: E501

        :param signing_ca_cert: The signing_ca_cert of this SwarmSpecCAConfig.
        :type signing_ca_cert: str
        """

        self._signing_ca_cert = signing_ca_cert

    @property
    def signing_ca_key(self) -> str:
        """Gets the signing_ca_key of this SwarmSpecCAConfig.

        The desired signing CA key for all swarm node TLS leaf certificates, in PEM format.  # noqa: E501

        :return: The signing_ca_key of this SwarmSpecCAConfig.
        :rtype: str
        """
        return self._signing_ca_key

    @signing_ca_key.setter
    def signing_ca_key(self, signing_ca_key: str):
        """Sets the signing_ca_key of this SwarmSpecCAConfig.

        The desired signing CA key for all swarm node TLS leaf certificates, in PEM format.  # noqa: E501

        :param signing_ca_key: The signing_ca_key of this SwarmSpecCAConfig.
        :type signing_ca_key: str
        """

        self._signing_ca_key = signing_ca_key
