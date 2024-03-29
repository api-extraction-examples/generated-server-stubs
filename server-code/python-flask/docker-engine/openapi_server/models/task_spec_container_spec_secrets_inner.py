from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.task_spec_container_spec_configs_inner_file import TaskSpecContainerSpecConfigsInnerFile
from openapi_server import util

from openapi_server.models.task_spec_container_spec_configs_inner_file import TaskSpecContainerSpecConfigsInnerFile  # noqa: E501

class TaskSpecContainerSpecSecretsInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, file=None, secret_id=None, secret_name=None):  # noqa: E501
        """TaskSpecContainerSpecSecretsInner - a model defined in OpenAPI

        :param file: The file of this TaskSpecContainerSpecSecretsInner.  # noqa: E501
        :type file: TaskSpecContainerSpecConfigsInnerFile
        :param secret_id: The secret_id of this TaskSpecContainerSpecSecretsInner.  # noqa: E501
        :type secret_id: str
        :param secret_name: The secret_name of this TaskSpecContainerSpecSecretsInner.  # noqa: E501
        :type secret_name: str
        """
        self.openapi_types = {
            'file': TaskSpecContainerSpecConfigsInnerFile,
            'secret_id': str,
            'secret_name': str
        }

        self.attribute_map = {
            'file': 'File',
            'secret_id': 'SecretID',
            'secret_name': 'SecretName'
        }

        self._file = file
        self._secret_id = secret_id
        self._secret_name = secret_name

    @classmethod
    def from_dict(cls, dikt) -> 'TaskSpecContainerSpecSecretsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskSpec_ContainerSpec_Secrets_inner of this TaskSpecContainerSpecSecretsInner.  # noqa: E501
        :rtype: TaskSpecContainerSpecSecretsInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def file(self) -> TaskSpecContainerSpecConfigsInnerFile:
        """Gets the file of this TaskSpecContainerSpecSecretsInner.


        :return: The file of this TaskSpecContainerSpecSecretsInner.
        :rtype: TaskSpecContainerSpecConfigsInnerFile
        """
        return self._file

    @file.setter
    def file(self, file: TaskSpecContainerSpecConfigsInnerFile):
        """Sets the file of this TaskSpecContainerSpecSecretsInner.


        :param file: The file of this TaskSpecContainerSpecSecretsInner.
        :type file: TaskSpecContainerSpecConfigsInnerFile
        """

        self._file = file

    @property
    def secret_id(self) -> str:
        """Gets the secret_id of this TaskSpecContainerSpecSecretsInner.

        SecretID represents the ID of the specific secret that we're referencing.  # noqa: E501

        :return: The secret_id of this TaskSpecContainerSpecSecretsInner.
        :rtype: str
        """
        return self._secret_id

    @secret_id.setter
    def secret_id(self, secret_id: str):
        """Sets the secret_id of this TaskSpecContainerSpecSecretsInner.

        SecretID represents the ID of the specific secret that we're referencing.  # noqa: E501

        :param secret_id: The secret_id of this TaskSpecContainerSpecSecretsInner.
        :type secret_id: str
        """

        self._secret_id = secret_id

    @property
    def secret_name(self) -> str:
        """Gets the secret_name of this TaskSpecContainerSpecSecretsInner.

        SecretName is the name of the secret that this references, but this is just provided for lookup/display purposes. The secret in the reference will be identified by its ID.   # noqa: E501

        :return: The secret_name of this TaskSpecContainerSpecSecretsInner.
        :rtype: str
        """
        return self._secret_name

    @secret_name.setter
    def secret_name(self, secret_name: str):
        """Sets the secret_name of this TaskSpecContainerSpecSecretsInner.

        SecretName is the name of the secret that this references, but this is just provided for lookup/display purposes. The secret in the reference will be identified by its ID.   # noqa: E501

        :param secret_name: The secret_name of this TaskSpecContainerSpecSecretsInner.
        :type secret_name: str
        """

        self._secret_name = secret_name
