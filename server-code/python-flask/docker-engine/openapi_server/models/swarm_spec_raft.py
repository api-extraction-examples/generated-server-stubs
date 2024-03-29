from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SwarmSpecRaft(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, election_tick=None, heartbeat_tick=None, keep_old_snapshots=None, log_entries_for_slow_followers=None, snapshot_interval=None):  # noqa: E501
        """SwarmSpecRaft - a model defined in OpenAPI

        :param election_tick: The election_tick of this SwarmSpecRaft.  # noqa: E501
        :type election_tick: int
        :param heartbeat_tick: The heartbeat_tick of this SwarmSpecRaft.  # noqa: E501
        :type heartbeat_tick: int
        :param keep_old_snapshots: The keep_old_snapshots of this SwarmSpecRaft.  # noqa: E501
        :type keep_old_snapshots: int
        :param log_entries_for_slow_followers: The log_entries_for_slow_followers of this SwarmSpecRaft.  # noqa: E501
        :type log_entries_for_slow_followers: int
        :param snapshot_interval: The snapshot_interval of this SwarmSpecRaft.  # noqa: E501
        :type snapshot_interval: int
        """
        self.openapi_types = {
            'election_tick': int,
            'heartbeat_tick': int,
            'keep_old_snapshots': int,
            'log_entries_for_slow_followers': int,
            'snapshot_interval': int
        }

        self.attribute_map = {
            'election_tick': 'ElectionTick',
            'heartbeat_tick': 'HeartbeatTick',
            'keep_old_snapshots': 'KeepOldSnapshots',
            'log_entries_for_slow_followers': 'LogEntriesForSlowFollowers',
            'snapshot_interval': 'SnapshotInterval'
        }

        self._election_tick = election_tick
        self._heartbeat_tick = heartbeat_tick
        self._keep_old_snapshots = keep_old_snapshots
        self._log_entries_for_slow_followers = log_entries_for_slow_followers
        self._snapshot_interval = snapshot_interval

    @classmethod
    def from_dict(cls, dikt) -> 'SwarmSpecRaft':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SwarmSpec_Raft of this SwarmSpecRaft.  # noqa: E501
        :rtype: SwarmSpecRaft
        """
        return util.deserialize_model(dikt, cls)

    @property
    def election_tick(self) -> int:
        """Gets the election_tick of this SwarmSpecRaft.

        The number of ticks that a follower will wait for a message from the leader before becoming a candidate and starting an election. `ElectionTick` must be greater than `HeartbeatTick`.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed.   # noqa: E501

        :return: The election_tick of this SwarmSpecRaft.
        :rtype: int
        """
        return self._election_tick

    @election_tick.setter
    def election_tick(self, election_tick: int):
        """Sets the election_tick of this SwarmSpecRaft.

        The number of ticks that a follower will wait for a message from the leader before becoming a candidate and starting an election. `ElectionTick` must be greater than `HeartbeatTick`.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed.   # noqa: E501

        :param election_tick: The election_tick of this SwarmSpecRaft.
        :type election_tick: int
        """

        self._election_tick = election_tick

    @property
    def heartbeat_tick(self) -> int:
        """Gets the heartbeat_tick of this SwarmSpecRaft.

        The number of ticks between heartbeats. Every HeartbeatTick ticks, the leader will send a heartbeat to the followers.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed.   # noqa: E501

        :return: The heartbeat_tick of this SwarmSpecRaft.
        :rtype: int
        """
        return self._heartbeat_tick

    @heartbeat_tick.setter
    def heartbeat_tick(self, heartbeat_tick: int):
        """Sets the heartbeat_tick of this SwarmSpecRaft.

        The number of ticks between heartbeats. Every HeartbeatTick ticks, the leader will send a heartbeat to the followers.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed.   # noqa: E501

        :param heartbeat_tick: The heartbeat_tick of this SwarmSpecRaft.
        :type heartbeat_tick: int
        """

        self._heartbeat_tick = heartbeat_tick

    @property
    def keep_old_snapshots(self) -> int:
        """Gets the keep_old_snapshots of this SwarmSpecRaft.

        The number of snapshots to keep beyond the current snapshot.  # noqa: E501

        :return: The keep_old_snapshots of this SwarmSpecRaft.
        :rtype: int
        """
        return self._keep_old_snapshots

    @keep_old_snapshots.setter
    def keep_old_snapshots(self, keep_old_snapshots: int):
        """Sets the keep_old_snapshots of this SwarmSpecRaft.

        The number of snapshots to keep beyond the current snapshot.  # noqa: E501

        :param keep_old_snapshots: The keep_old_snapshots of this SwarmSpecRaft.
        :type keep_old_snapshots: int
        """

        self._keep_old_snapshots = keep_old_snapshots

    @property
    def log_entries_for_slow_followers(self) -> int:
        """Gets the log_entries_for_slow_followers of this SwarmSpecRaft.

        The number of log entries to keep around to sync up slow followers after a snapshot is created.  # noqa: E501

        :return: The log_entries_for_slow_followers of this SwarmSpecRaft.
        :rtype: int
        """
        return self._log_entries_for_slow_followers

    @log_entries_for_slow_followers.setter
    def log_entries_for_slow_followers(self, log_entries_for_slow_followers: int):
        """Sets the log_entries_for_slow_followers of this SwarmSpecRaft.

        The number of log entries to keep around to sync up slow followers after a snapshot is created.  # noqa: E501

        :param log_entries_for_slow_followers: The log_entries_for_slow_followers of this SwarmSpecRaft.
        :type log_entries_for_slow_followers: int
        """

        self._log_entries_for_slow_followers = log_entries_for_slow_followers

    @property
    def snapshot_interval(self) -> int:
        """Gets the snapshot_interval of this SwarmSpecRaft.

        The number of log entries between snapshots.  # noqa: E501

        :return: The snapshot_interval of this SwarmSpecRaft.
        :rtype: int
        """
        return self._snapshot_interval

    @snapshot_interval.setter
    def snapshot_interval(self, snapshot_interval: int):
        """Sets the snapshot_interval of this SwarmSpecRaft.

        The number of log entries between snapshots.  # noqa: E501

        :param snapshot_interval: The snapshot_interval of this SwarmSpecRaft.
        :type snapshot_interval: int
        """

        self._snapshot_interval = snapshot_interval
