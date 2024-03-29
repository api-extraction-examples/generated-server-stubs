from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.endpoint_spec import EndpointSpec
from openapi_server.models.service_spec_mode import ServiceSpecMode
from openapi_server.models.service_spec_networks_inner import ServiceSpecNetworksInner
from openapi_server.models.service_spec_rollback_config import ServiceSpecRollbackConfig
from openapi_server.models.service_spec_update_config import ServiceSpecUpdateConfig
from openapi_server.models.task_spec import TaskSpec
from openapi_server import util

from openapi_server.models.endpoint_spec import EndpointSpec  # noqa: E501
from openapi_server.models.service_spec_mode import ServiceSpecMode  # noqa: E501
from openapi_server.models.service_spec_networks_inner import ServiceSpecNetworksInner  # noqa: E501
from openapi_server.models.service_spec_rollback_config import ServiceSpecRollbackConfig  # noqa: E501
from openapi_server.models.service_spec_update_config import ServiceSpecUpdateConfig  # noqa: E501
from openapi_server.models.task_spec import TaskSpec  # noqa: E501

class ServiceSpec(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, endpoint_spec=None, labels=None, mode=None, name=None, networks=None, rollback_config=None, task_template=None, update_config=None):  # noqa: E501
        """ServiceSpec - a model defined in OpenAPI

        :param endpoint_spec: The endpoint_spec of this ServiceSpec.  # noqa: E501
        :type endpoint_spec: EndpointSpec
        :param labels: The labels of this ServiceSpec.  # noqa: E501
        :type labels: Dict[str, str]
        :param mode: The mode of this ServiceSpec.  # noqa: E501
        :type mode: ServiceSpecMode
        :param name: The name of this ServiceSpec.  # noqa: E501
        :type name: str
        :param networks: The networks of this ServiceSpec.  # noqa: E501
        :type networks: List[ServiceSpecNetworksInner]
        :param rollback_config: The rollback_config of this ServiceSpec.  # noqa: E501
        :type rollback_config: ServiceSpecRollbackConfig
        :param task_template: The task_template of this ServiceSpec.  # noqa: E501
        :type task_template: TaskSpec
        :param update_config: The update_config of this ServiceSpec.  # noqa: E501
        :type update_config: ServiceSpecUpdateConfig
        """
        self.openapi_types = {
            'endpoint_spec': EndpointSpec,
            'labels': Dict[str, str],
            'mode': ServiceSpecMode,
            'name': str,
            'networks': List[ServiceSpecNetworksInner],
            'rollback_config': ServiceSpecRollbackConfig,
            'task_template': TaskSpec,
            'update_config': ServiceSpecUpdateConfig
        }

        self.attribute_map = {
            'endpoint_spec': 'EndpointSpec',
            'labels': 'Labels',
            'mode': 'Mode',
            'name': 'Name',
            'networks': 'Networks',
            'rollback_config': 'RollbackConfig',
            'task_template': 'TaskTemplate',
            'update_config': 'UpdateConfig'
        }

        self._endpoint_spec = endpoint_spec
        self._labels = labels
        self._mode = mode
        self._name = name
        self._networks = networks
        self._rollback_config = rollback_config
        self._task_template = task_template
        self._update_config = update_config

    @classmethod
    def from_dict(cls, dikt) -> 'ServiceSpec':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ServiceSpec of this ServiceSpec.  # noqa: E501
        :rtype: ServiceSpec
        """
        return util.deserialize_model(dikt, cls)

    @property
    def endpoint_spec(self) -> EndpointSpec:
        """Gets the endpoint_spec of this ServiceSpec.


        :return: The endpoint_spec of this ServiceSpec.
        :rtype: EndpointSpec
        """
        return self._endpoint_spec

    @endpoint_spec.setter
    def endpoint_spec(self, endpoint_spec: EndpointSpec):
        """Sets the endpoint_spec of this ServiceSpec.


        :param endpoint_spec: The endpoint_spec of this ServiceSpec.
        :type endpoint_spec: EndpointSpec
        """

        self._endpoint_spec = endpoint_spec

    @property
    def labels(self) -> Dict[str, str]:
        """Gets the labels of this ServiceSpec.

        User-defined key/value metadata.  # noqa: E501

        :return: The labels of this ServiceSpec.
        :rtype: Dict[str, str]
        """
        return self._labels

    @labels.setter
    def labels(self, labels: Dict[str, str]):
        """Sets the labels of this ServiceSpec.

        User-defined key/value metadata.  # noqa: E501

        :param labels: The labels of this ServiceSpec.
        :type labels: Dict[str, str]
        """

        self._labels = labels

    @property
    def mode(self) -> ServiceSpecMode:
        """Gets the mode of this ServiceSpec.


        :return: The mode of this ServiceSpec.
        :rtype: ServiceSpecMode
        """
        return self._mode

    @mode.setter
    def mode(self, mode: ServiceSpecMode):
        """Sets the mode of this ServiceSpec.


        :param mode: The mode of this ServiceSpec.
        :type mode: ServiceSpecMode
        """

        self._mode = mode

    @property
    def name(self) -> str:
        """Gets the name of this ServiceSpec.

        Name of the service.  # noqa: E501

        :return: The name of this ServiceSpec.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ServiceSpec.

        Name of the service.  # noqa: E501

        :param name: The name of this ServiceSpec.
        :type name: str
        """

        self._name = name

    @property
    def networks(self) -> List[ServiceSpecNetworksInner]:
        """Gets the networks of this ServiceSpec.

        Array of network names or IDs to attach the service to.  # noqa: E501

        :return: The networks of this ServiceSpec.
        :rtype: List[ServiceSpecNetworksInner]
        """
        return self._networks

    @networks.setter
    def networks(self, networks: List[ServiceSpecNetworksInner]):
        """Sets the networks of this ServiceSpec.

        Array of network names or IDs to attach the service to.  # noqa: E501

        :param networks: The networks of this ServiceSpec.
        :type networks: List[ServiceSpecNetworksInner]
        """

        self._networks = networks

    @property
    def rollback_config(self) -> ServiceSpecRollbackConfig:
        """Gets the rollback_config of this ServiceSpec.


        :return: The rollback_config of this ServiceSpec.
        :rtype: ServiceSpecRollbackConfig
        """
        return self._rollback_config

    @rollback_config.setter
    def rollback_config(self, rollback_config: ServiceSpecRollbackConfig):
        """Sets the rollback_config of this ServiceSpec.


        :param rollback_config: The rollback_config of this ServiceSpec.
        :type rollback_config: ServiceSpecRollbackConfig
        """

        self._rollback_config = rollback_config

    @property
    def task_template(self) -> TaskSpec:
        """Gets the task_template of this ServiceSpec.


        :return: The task_template of this ServiceSpec.
        :rtype: TaskSpec
        """
        return self._task_template

    @task_template.setter
    def task_template(self, task_template: TaskSpec):
        """Sets the task_template of this ServiceSpec.


        :param task_template: The task_template of this ServiceSpec.
        :type task_template: TaskSpec
        """

        self._task_template = task_template

    @property
    def update_config(self) -> ServiceSpecUpdateConfig:
        """Gets the update_config of this ServiceSpec.


        :return: The update_config of this ServiceSpec.
        :rtype: ServiceSpecUpdateConfig
        """
        return self._update_config

    @update_config.setter
    def update_config(self, update_config: ServiceSpecUpdateConfig):
        """Sets the update_config of this ServiceSpec.


        :param update_config: The update_config of this ServiceSpec.
        :type update_config: ServiceSpecUpdateConfig
        """

        self._update_config = update_config
