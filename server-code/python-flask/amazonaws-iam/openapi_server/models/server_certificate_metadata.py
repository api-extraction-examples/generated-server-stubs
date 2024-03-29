from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ServerCertificateMetadata(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, path=None, server_certificate_name=None, server_certificate_id=None, arn=None, upload_date=None, expiration=None):  # noqa: E501
        """ServerCertificateMetadata - a model defined in OpenAPI

        :param path: The path of this ServerCertificateMetadata.  # noqa: E501
        :type path: str
        :param server_certificate_name: The server_certificate_name of this ServerCertificateMetadata.  # noqa: E501
        :type server_certificate_name: str
        :param server_certificate_id: The server_certificate_id of this ServerCertificateMetadata.  # noqa: E501
        :type server_certificate_id: str
        :param arn: The arn of this ServerCertificateMetadata.  # noqa: E501
        :type arn: str
        :param upload_date: The upload_date of this ServerCertificateMetadata.  # noqa: E501
        :type upload_date: datetime
        :param expiration: The expiration of this ServerCertificateMetadata.  # noqa: E501
        :type expiration: datetime
        """
        self.openapi_types = {
            'path': str,
            'server_certificate_name': str,
            'server_certificate_id': str,
            'arn': str,
            'upload_date': datetime,
            'expiration': datetime
        }

        self.attribute_map = {
            'path': 'Path',
            'server_certificate_name': 'ServerCertificateName',
            'server_certificate_id': 'ServerCertificateId',
            'arn': 'Arn',
            'upload_date': 'UploadDate',
            'expiration': 'Expiration'
        }

        self._path = path
        self._server_certificate_name = server_certificate_name
        self._server_certificate_id = server_certificate_id
        self._arn = arn
        self._upload_date = upload_date
        self._expiration = expiration

    @classmethod
    def from_dict(cls, dikt) -> 'ServerCertificateMetadata':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ServerCertificateMetadata of this ServerCertificateMetadata.  # noqa: E501
        :rtype: ServerCertificateMetadata
        """
        return util.deserialize_model(dikt, cls)

    @property
    def path(self) -> str:
        """Gets the path of this ServerCertificateMetadata.


        :return: The path of this ServerCertificateMetadata.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path: str):
        """Sets the path of this ServerCertificateMetadata.


        :param path: The path of this ServerCertificateMetadata.
        :type path: str
        """
        if path is None:
            raise ValueError("Invalid value for `path`, must not be `None`")  # noqa: E501

        self._path = path

    @property
    def server_certificate_name(self) -> str:
        """Gets the server_certificate_name of this ServerCertificateMetadata.


        :return: The server_certificate_name of this ServerCertificateMetadata.
        :rtype: str
        """
        return self._server_certificate_name

    @server_certificate_name.setter
    def server_certificate_name(self, server_certificate_name: str):
        """Sets the server_certificate_name of this ServerCertificateMetadata.


        :param server_certificate_name: The server_certificate_name of this ServerCertificateMetadata.
        :type server_certificate_name: str
        """
        if server_certificate_name is None:
            raise ValueError("Invalid value for `server_certificate_name`, must not be `None`")  # noqa: E501

        self._server_certificate_name = server_certificate_name

    @property
    def server_certificate_id(self) -> str:
        """Gets the server_certificate_id of this ServerCertificateMetadata.


        :return: The server_certificate_id of this ServerCertificateMetadata.
        :rtype: str
        """
        return self._server_certificate_id

    @server_certificate_id.setter
    def server_certificate_id(self, server_certificate_id: str):
        """Sets the server_certificate_id of this ServerCertificateMetadata.


        :param server_certificate_id: The server_certificate_id of this ServerCertificateMetadata.
        :type server_certificate_id: str
        """
        if server_certificate_id is None:
            raise ValueError("Invalid value for `server_certificate_id`, must not be `None`")  # noqa: E501

        self._server_certificate_id = server_certificate_id

    @property
    def arn(self) -> str:
        """Gets the arn of this ServerCertificateMetadata.


        :return: The arn of this ServerCertificateMetadata.
        :rtype: str
        """
        return self._arn

    @arn.setter
    def arn(self, arn: str):
        """Sets the arn of this ServerCertificateMetadata.


        :param arn: The arn of this ServerCertificateMetadata.
        :type arn: str
        """
        if arn is None:
            raise ValueError("Invalid value for `arn`, must not be `None`")  # noqa: E501

        self._arn = arn

    @property
    def upload_date(self) -> datetime:
        """Gets the upload_date of this ServerCertificateMetadata.


        :return: The upload_date of this ServerCertificateMetadata.
        :rtype: datetime
        """
        return self._upload_date

    @upload_date.setter
    def upload_date(self, upload_date: datetime):
        """Sets the upload_date of this ServerCertificateMetadata.


        :param upload_date: The upload_date of this ServerCertificateMetadata.
        :type upload_date: datetime
        """

        self._upload_date = upload_date

    @property
    def expiration(self) -> datetime:
        """Gets the expiration of this ServerCertificateMetadata.


        :return: The expiration of this ServerCertificateMetadata.
        :rtype: datetime
        """
        return self._expiration

    @expiration.setter
    def expiration(self, expiration: datetime):
        """Sets the expiration of this ServerCertificateMetadata.


        :param expiration: The expiration of this ServerCertificateMetadata.
        :type expiration: datetime
        """

        self._expiration = expiration
