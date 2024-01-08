from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class UploadSigningCertificateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_name=None, certificate_body=None):  # noqa: E501
        """UploadSigningCertificateRequest - a model defined in OpenAPI

        :param user_name: The user_name of this UploadSigningCertificateRequest.  # noqa: E501
        :type user_name: str
        :param certificate_body: The certificate_body of this UploadSigningCertificateRequest.  # noqa: E501
        :type certificate_body: str
        """
        self.openapi_types = {
            'user_name': str,
            'certificate_body': str
        }

        self.attribute_map = {
            'user_name': 'UserName',
            'certificate_body': 'CertificateBody'
        }

        self._user_name = user_name
        self._certificate_body = certificate_body

    @classmethod
    def from_dict(cls, dikt) -> 'UploadSigningCertificateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UploadSigningCertificateRequest of this UploadSigningCertificateRequest.  # noqa: E501
        :rtype: UploadSigningCertificateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_name(self) -> str:
        """Gets the user_name of this UploadSigningCertificateRequest.


        :return: The user_name of this UploadSigningCertificateRequest.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this UploadSigningCertificateRequest.


        :param user_name: The user_name of this UploadSigningCertificateRequest.
        :type user_name: str
        """

        self._user_name = user_name

    @property
    def certificate_body(self) -> str:
        """Gets the certificate_body of this UploadSigningCertificateRequest.


        :return: The certificate_body of this UploadSigningCertificateRequest.
        :rtype: str
        """
        return self._certificate_body

    @certificate_body.setter
    def certificate_body(self, certificate_body: str):
        """Sets the certificate_body of this UploadSigningCertificateRequest.


        :param certificate_body: The certificate_body of this UploadSigningCertificateRequest.
        :type certificate_body: str
        """
        if certificate_body is None:
            raise ValueError("Invalid value for `certificate_body`, must not be `None`")  # noqa: E501

        self._certificate_body = certificate_body