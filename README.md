# 🔊 Smart Hearing Aid – Reverse Engineered Design of ReSound Omnia

## 📘 Project Summary

This project presents a **reverse-engineered object-oriented design** of the [ReSound Omnia Smart Hearing Aid](https://www.resound.com/en-in/hearing-aids/resound-hearing-aids/resound-omnia). The goal was to deconstruct the software architecture and functionality of Omnia and model it using clean, modular Java code.

The system replicates Omnia’s core features such as:
- All-Around directional sound processing
- Advanced noise reduction
- Personalized hearing profiles
- Bluetooth connectivity
- Environment-based adaptive audio modes

---

## 🛠️ Approach

We examined product specs, promotional material, and user manuals to identify the **functional blocks** of the hearing aid. Based on these, we:
- Identified components (signal processing, user profiling, feedback control, etc.)
- Designed class abstractions for each
- Modeled system flow from audio input to processed output

Our implementation demonstrates how **object-oriented principles** like abstraction, encapsulation, modularity, and polymorphism can be used to architect complex embedded audio systems.

---

## 🧱 Object-Oriented Design

| Class | Function |
|-------|----------|
| `SmartHearingAid` | Acts as the brain, orchestrating all components and user settings |
| `AudioProcessor` | Captures input and manages the DSP pipeline |
| `SignalProcessor` | Enhances speech, reduces background noise, applies gain |
| `NoiseReductionAlgorithm` | Implements real-time adaptive noise suppression |
| `FeedbackCancellation` | Detects and cancels audio feedback |
| `UserProfile` | Stores user preferences and audiometric data |
| `HearingLossProfile` | Models audiogram and translates it to gain settings |
| `FrequencySettings` | Controls per-band amplification and enhancement |
| `ModeSelector` | Enables dynamic switching (e.g., “Restaurant”, “Outdoor”) |
| `BluetoothConnector` | Simulates wireless audio streaming and settings sync |
| `BatteryManager` | Tracks power usage and low-battery behaviors |
| `AudioSettings` | Manages general audio preferences (volume, output mode) |
| `SmartHearingAidDemo` | Entry-point showing system initialization and behavior |

---

## 🔍 Feature Mapping to ReSound Omnia

| ReSound Omnia Feature | Our Implementation |
|------------------------|---------------------|
| All-Around Directionality | `SignalProcessor` + `ModeSelector` |
| Background Noise Reduction | `NoiseReductionAlgorithm` |
| Personalized Gain via Audiogram | `HearingLossProfile` + `FrequencySettings` |
| Feedback Suppression | `FeedbackCancellation` |
| Bluetooth Audio Streaming | `BluetoothConnector` |
| Mobile App Sync | Simulated via `BluetoothConnector` |
| Battery Monitoring | `BatteryManager` |
| Environment Switching | `ModeSelector` |

---


## 📂 File Structure

```
/src
  ├── SmartHearingAid.java
  ├── SmartHearingAidDemo.java
  ├── AudioProcessor.java
  ├── SignalProcessor.java
  ├── NoiseReductionAlgorithm.java
  ├── FeedbackCancellation.java
  ├── FrequencySettings.java
  ├── UserProfile.java
  ├── HearingLossProfile.java
  ├── ModeSelector.java
  ├── BluetoothConnector.java
  ├── BatteryManager.java
  └── AudioSettings.java
```

---

