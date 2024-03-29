from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.env_var_value import EnvVarValue
from openapi_server import util

from openapi_server.models.env_var_value import EnvVarValue  # noqa: E501

class CreateEnvVarsRequestInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, key=None, scopes=None, values=None):  # noqa: E501
        """CreateEnvVarsRequestInner - a model defined in OpenAPI

        :param key: The key of this CreateEnvVarsRequestInner.  # noqa: E501
        :type key: str
        :param scopes: The scopes of this CreateEnvVarsRequestInner.  # noqa: E501
        :type scopes: List[str]
        :param values: The values of this CreateEnvVarsRequestInner.  # noqa: E501
        :type values: List[EnvVarValue]
        """
        self.openapi_types = {
            'key': str,
            'scopes': List[str],
            'values': List[EnvVarValue]
        }

        self.attribute_map = {
            'key': 'key',
            'scopes': 'scopes',
            'values': 'values'
        }

        self._key = key
        self._scopes = scopes
        self._values = values

    @classmethod
    def from_dict(cls, dikt) -> 'CreateEnvVarsRequestInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The createEnvVars_request_inner of this CreateEnvVarsRequestInner.  # noqa: E501
        :rtype: CreateEnvVarsRequestInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def key(self) -> str:
        """Gets the key of this CreateEnvVarsRequestInner.

        The existing or new name of the key, if you wish to rename it (case-sensitive)  # noqa: E501

        :return: The key of this CreateEnvVarsRequestInner.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this CreateEnvVarsRequestInner.

        The existing or new name of the key, if you wish to rename it (case-sensitive)  # noqa: E501

        :param key: The key of this CreateEnvVarsRequestInner.
        :type key: str
        """

        self._key = key

    @property
    def scopes(self) -> List[str]:
        """Gets the scopes of this CreateEnvVarsRequestInner.

        The scopes that this environment variable is set to (Pro plans and above)  # noqa: E501

        :return: The scopes of this CreateEnvVarsRequestInner.
        :rtype: List[str]
        """
        return self._scopes

    @scopes.setter
    def scopes(self, scopes: List[str]):
        """Sets the scopes of this CreateEnvVarsRequestInner.

        The scopes that this environment variable is set to (Pro plans and above)  # noqa: E501

        :param scopes: The scopes of this CreateEnvVarsRequestInner.
        :type scopes: List[str]
        """
        allowed_values = ["builds", "functions", "runtime", "post-processing"]  # noqa: E501
        if not set(scopes).issubset(set(allowed_values)):
            raise ValueError(
                "Invalid values for `scopes` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(scopes) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._scopes = scopes

    @property
    def values(self) -> List[EnvVarValue]:
        """Gets the values of this CreateEnvVarsRequestInner.


        :return: The values of this CreateEnvVarsRequestInner.
        :rtype: List[EnvVarValue]
        """
        return self._values

    @values.setter
    def values(self, values: List[EnvVarValue]):
        """Sets the values of this CreateEnvVarsRequestInner.


        :param values: The values of this CreateEnvVarsRequestInner.
        :type values: List[EnvVarValue]
        """

        self._values = values
