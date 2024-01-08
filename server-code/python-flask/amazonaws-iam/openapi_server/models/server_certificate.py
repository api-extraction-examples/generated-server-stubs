from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.server_certificate_server_certificate_metadata import ServerCertificateServerCertificateMetadata
from openapi_server import util

from openapi_server.models.server_certificate_server_certificate_metadata import ServerCertificateServerCertificateMetadata  # noqa: E501

class ServerCertificate(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, server_certificate_metadata=None, certificate_body=None, certificate_chain=None, tags=None):  # noqa: E501
        """ServerCertificate - a model defined in OpenAPI

        :param server_certificate_metadata: The server_certificate_metadata of this ServerCertificate.  # noqa: E501
        :type server_certificate_metadata: ServerCertificateServerCertificateMetadata
        :param certificate_body: The certificate_body of this ServerCertificate.  # noqa: E501
        :type certificate_body: str
        :param certificate_chain: The certificate_chain of this ServerCertificate.  # noqa: E501
        :type certificate_chain: str
        :param tags: The tags of this ServerCertificate.  # noqa: E501
        :type tags: List
        """
        self.openapi_types = {
            'server_certificate_metadata': ServerCertificateServerCertificateMetadata,
            'certificate_body': str,
            'certificate_chain': str,
            'tags': List
        }

        self.attribute_map = {
            'server_certificate_metadata': 'ServerCertificateMetadata',
            'certificate_body': 'CertificateBody',
            'certificate_chain': 'CertificateChain',
            'tags': 'Tags'
        }

        self._server_certificate_metadata = server_certificate_metadata
        self._certificate_body = certificate_body
        self._certificate_chain = certificate_chain
        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'ServerCertificate':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ServerCertificate of this ServerCertificate.  # noqa: E501
        :rtype: ServerCertificate
        """
        return util.deserialize_model(dikt, cls)

    @property
    def server_certificate_metadata(self) -> ServerCertificateServerCertificateMetadata:
        """Gets the server_certificate_metadata of this ServerCertificate.


        :return: The server_certificate_metadata of this ServerCertificate.
        :rtype: ServerCertificateServerCertificateMetadata
        """
        return self._server_certificate_metadata

    @server_certificate_metadata.setter
    def server_certificate_metadata(self, server_certificate_metadata: ServerCertificateServerCertificateMetadata):
        """Sets the server_certificate_metadata of this ServerCertificate.


        :param server_certificate_metadata: The server_certificate_metadata of this ServerCertificate.
        :type server_certificate_metadata: ServerCertificateServerCertificateMetadata
        """
        if server_certificate_metadata is None:
            raise ValueError("Invalid value for `server_certificate_metadata`, must not be `None`")  # noqa: E501

        self._server_certificate_metadata = server_certificate_metadata

    @property
    def certificate_body(self) -> str:
        """Gets the certificate_body of this ServerCertificate.


        :return: The certificate_body of this ServerCertificate.
        :rtype: str
        """
        return self._certificate_body

    @certificate_body.setter
    def certificate_body(self, certificate_body: str):
        """Sets the certificate_body of this ServerCertificate.


        :param certificate_body: The certificate_body of this ServerCertificate.
        :type certificate_body: str
        """
        if certificate_body is None:
            raise ValueError("Invalid value for `certificate_body`, must not be `None`")  # noqa: E501

        self._certificate_body = certificate_body

    @property
    def certificate_chain(self) -> str:
        """Gets the certificate_chain of this ServerCertificate.


        :return: The certificate_chain of this ServerCertificate.
        :rtype: str
        """
        return self._certificate_chain

    @certificate_chain.setter
    def certificate_chain(self, certificate_chain: str):
        """Sets the certificate_chain of this ServerCertificate.


        :param certificate_chain: The certificate_chain of this ServerCertificate.
        :type certificate_chain: str
        """

        self._certificate_chain = certificate_chain

    @property
    def tags(self) -> List:
        """Gets the tags of this ServerCertificate.


        :return: The tags of this ServerCertificate.
        :rtype: List
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List):
        """Sets the tags of this ServerCertificate.


        :param tags: The tags of this ServerCertificate.
        :type tags: List
        """

        self._tags = tags
